package com.azamovhudstc.quizapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.adapter.QuizOptionAdapter;
import com.azamovhudstc.quizapp.util.Constants;

public class QuizOptionActivity extends AppCompatActivity {

    private ImageView ivBack;
    private RecyclerView rvQuizOption;

    private QuizOptionAdapter quizOptionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_option);
        initView();
        setupRecyclerView();

        ivBack.setOnClickListener(view -> {
            finish();
        });
    }

    private void initView() {
        ivBack = findViewById(R.id.iv_back);
        rvQuizOption = findViewById(R.id.quiz_option_rv);
    }

    private void setupRecyclerView() {
        quizOptionAdapter = new QuizOptionAdapter(this);
        rvQuizOption.setLayoutManager(new LinearLayoutManager(this));
        rvQuizOption.setAdapter(quizOptionAdapter);
    }
}