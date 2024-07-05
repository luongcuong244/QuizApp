package com.azamovhudstc.quizapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.model.Option;
import com.azamovhudstc.quizapp.model.Question;
import com.azamovhudstc.quizapp.model.QuestionCategory;
import com.azamovhudstc.quizapp.util.Constants;
import com.azamovhudstc.quizapp.util.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class QuizActivity extends AppCompatActivity {
    private ImageView ivBack;
    private ProgressBar progressBar;
    private TextView tvQuestion, tvQuestionNumber, tvOption1, tvOption2, tvOption3, tvOption4;
    private CardView cardOptionBg1, cardOptionBg2, cardOptionBg3, cardOptionBg4;
    private Button btnNext;

    private int currentQuestionIndex = 0;
    private int selectedOptionIndex = -1;
    private int correctAnswers = 0;
    private final List<Question> questions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();

        String subjectName = intent.getStringExtra(Constants.SUBJECT);
        QuestionCategory questionCategory = QuestionCategory.toQuestionCategory(subjectName);
        for (int i = 0; i < Question.allQuestions.length; i++) {
            Question question = Question.allQuestions[i];
            // Xáo các option
            List<Option> list = Arrays.asList(question.getOptions());
            Collections.shuffle(list);
            question.setOptions(list.toArray(new Option[0]));

            if (question.getCategory() == questionCategory) {
                questions.add(question);
            }
        }
        Collections.shuffle(questions);

        initView();
        setupOnClickListener();
        displayQuestion();
    }

    private void initView() {
        ivBack = findViewById(R.id.iv_back);
        progressBar = findViewById(R.id.pb_progress);
        tvQuestion = findViewById(R.id.tv_question);
        tvQuestionNumber = findViewById(R.id.tv_question_order);
        tvOption1 = findViewById(R.id.tv_option_1);
        tvOption2 = findViewById(R.id.tv_option_2);
        tvOption3 = findViewById(R.id.tv_option_3);
        tvOption4 = findViewById(R.id.tv_option_4);
        cardOptionBg1 = findViewById(R.id.cv_option_1);
        cardOptionBg2 = findViewById(R.id.cv_option_2);
        cardOptionBg3 = findViewById(R.id.cv_option_3);
        cardOptionBg4 = findViewById(R.id.cv_option_4);
        btnNext = findViewById(R.id.btn_next);

        progressBar.setMax(questions.size());
    }

    private void setupOnClickListener() {
        ivBack.setOnClickListener(view -> {
            finish();
        });
        cardOptionBg1.setOnClickListener(view -> {
            selectOption(1);
            selectedOptionIndex = 1;
        });
        cardOptionBg2.setOnClickListener(view -> {
            selectOption(2);
            selectedOptionIndex = 2;
        });
        cardOptionBg3.setOnClickListener(view -> {
            selectOption(3);
            selectedOptionIndex = 3;
        });
        cardOptionBg4.setOnClickListener(view -> {
            selectOption(4);
            selectedOptionIndex = 4;
        });
        btnNext.setOnClickListener(view -> {
            if (selectedOptionIndex == -1) {
                Toast.makeText(this, "Vui lòng chọn một đáp án", Toast.LENGTH_SHORT).show();
                return;
            }
            checkAnswer();
            unSelectAllOptions();
            if (currentQuestionIndex < questions.size() - 1) {
                currentQuestionIndex++;
                displayQuestion();
                if (currentQuestionIndex == questions.size() - 1) {
                    btnNext.setText("Finish");
                }
            } else {
                Intent intent = new Intent(this, FinalResultActivity.class);
                intent.putExtra(Constants.CORRECT, correctAnswers);
                intent.putExtra(Constants.INCORRECT, questions.size() - correctAnswers);
                intent.putExtra(Constants.SUBJECT, questions.get(0).getCategory().getSubjectName());
                intent.putExtra(Constants.TYPE, "quiz");
                startActivity(intent);
            }
        });
    }

    private void displayQuestion() {
        Question question = questions.get(currentQuestionIndex);
        tvQuestion.setText(question.getQuestionText());
        tvQuestionNumber.setText(String.valueOf(currentQuestionIndex + 1));
        tvOption1.setText(question.getOptions()[0].getText());
        tvOption2.setText(question.getOptions()[1].getText());
        tvOption3.setText(question.getOptions()[2].getText());
        tvOption4.setText(question.getOptions()[3].getText());
        progressBar.setProgress(currentQuestionIndex);
    }

    private void selectOption(int optionIndex) {
        unSelectAllOptions();
        switch (optionIndex) {
            case 1: {
                cardOptionBg1.setCardBackgroundColor(getResources().getColor(R.color.light_blue_med));
                tvOption1.setTextColor(getResources().getColor(R.color.white));
                break;
            }
            case 2: {
                cardOptionBg2.setCardBackgroundColor(getResources().getColor(R.color.light_blue_med));
                tvOption2.setTextColor(getResources().getColor(R.color.white));
                break;
            }
            case 3: {
                cardOptionBg3.setCardBackgroundColor(getResources().getColor(R.color.light_blue_med));
                tvOption3.setTextColor(getResources().getColor(R.color.white));
                break;
            }
            case 4: {
                cardOptionBg4.setCardBackgroundColor(getResources().getColor(R.color.light_blue_med));
                tvOption4.setTextColor(getResources().getColor(R.color.white));
                break;
            }
        }
    }

    private void unSelectAllOptions() {
        cardOptionBg1.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOptionBg2.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOptionBg3.setCardBackgroundColor(getResources().getColor(R.color.white));
        cardOptionBg4.setCardBackgroundColor(getResources().getColor(R.color.white));
        tvOption1.setTextColor(getResources().getColor(R.color.black));
        tvOption2.setTextColor(getResources().getColor(R.color.black));
        tvOption3.setTextColor(getResources().getColor(R.color.black));
        tvOption4.setTextColor(getResources().getColor(R.color.black));
        selectedOptionIndex = -1;
    }

    private void checkAnswer() {
        Question question = questions.get(currentQuestionIndex);
        if (question.getOptions()[selectedOptionIndex - 1].isCorrect()) {
            correctAnswers++;
        }
    }
}