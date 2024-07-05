package com.azamovhudstc.quizapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.database.QuizPref;
import com.azamovhudstc.quizapp.model.HistoryModel;
import com.azamovhudstc.quizapp.util.Constants;
import com.azamovhudstc.quizapp.util.Utils;
import com.google.android.material.button.MaterialButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;

public class FinalResultActivity extends AppCompatActivity {
    private TextView tvSubject, tvCorrect, tvIncorrect, tvDate, tvWellDone;
    private MaterialButton btnFinishQuiz;
    private QuizPref quizPref = QuizPref.getInstance();
    HistoryModel historyModel;

    private boolean isFromHistory = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);
        initView();
        onBackPressed();
        Intent intent = getIntent();
        int correctAnswer = intent.getIntExtra(Constants.CORRECT, 0);
        int incorrectAnswer = intent.getIntExtra(Constants.INCORRECT, 0);
        String subject = intent.getStringExtra(Constants.SUBJECT);
        int earnedPoints = (correctAnswer * Constants.CORRECT_POINT) - (incorrectAnswer * Constants.INCORRECT_POINT);
        TextView textView = findViewById(R.id.result_);

        historyModel = new HistoryModel(Calendar.getInstance().getTimeInMillis(), subject, correctAnswer, incorrectAnswer, earnedPoints);
        if (historyModel.getEarned() < 0) {
            historyModel.setEarned(0);
        }
        if (historyModel.getOverallPoints() < 0) {
            historyModel.setOverallPoints(0);

        }
        historyModel.setOverallPoints(quizPref.getPoint() + historyModel.getEarned());
        quizPref.savePoint(quizPref.getPoint() + historyModel.getEarned());

        isFromHistory = intent.getStringExtra(Constants.TYPE).equals("history");

        if (!isFromHistory) {
            saveSharedLocalData();
        }
        displayData(historyModel);
        setupFinishButton();
    }

    public void setupFinishButton() {
        btnFinishQuiz = findViewById(R.id.btnFinishQuiz);
        btnFinishQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinalResultActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        if (isFromHistory) {
            btnFinishQuiz.setVisibility(View.GONE);
        }
    }

    public void saveSharedLocalData() {
        Type type = new TypeToken<ArrayList<HistoryModel>>() {
        }.getType();
        ArrayList<HistoryModel> historyModelArrayList;
        Gson gson = new Gson();
        if (quizPref.getHistoryQuiz().isEmpty()) {
            historyModelArrayList = new ArrayList<>();
        } else {
            historyModelArrayList = new ArrayList<>(gson.fromJson(quizPref.getHistoryQuiz(), type));
        }
        historyModelArrayList.add(historyModel);
        String toJson = gson.toJson(historyModelArrayList, type);
        quizPref.historyQuiz(toJson);
    }

    public void initView() {
        tvSubject = findViewById(R.id.textView16);
        tvCorrect = findViewById(R.id.textView19);
        tvIncorrect = findViewById(R.id.textView27);
        tvDate = findViewById(R.id.textView30);
        tvWellDone = findViewById(R.id.tvWellDone);
    }

    private void displayData(HistoryModel attempt) {
        tvSubject.setText(attempt.getSubject());
        tvCorrect.setText(String.valueOf(attempt.getCorrect()));
        tvIncorrect.setText(String.valueOf(attempt.getIncorrect()));
        if (attempt.getCorrect() >= attempt.getIncorrect()) {
            tvWellDone.setText("Chúc mừng, " + quizPref.getName());
        } else {
            tvWellDone.setText("Rất tiếc, " + quizPref.getName());

        }
        tvDate.setText(Utils.formatDate(attempt.getCreatedTime()));
    }

    public void onBackPressed() {
        findViewById(R.id.imageViewFinalResultQuiz).setOnClickListener(view -> {
            if (isFromHistory) {
                finish();
            } else {
                Intent intent = new Intent(FinalResultActivity.this, HomeActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}