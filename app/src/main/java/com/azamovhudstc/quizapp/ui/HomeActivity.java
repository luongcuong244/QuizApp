package com.azamovhudstc.quizapp.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.database.QuizPref;

public class HomeActivity extends AppCompatActivity {
    TextView userNameHome;
    CardView cvStartQuiz, cvHistory, cvLogout, cvAbout;
    QuizPref quizPref;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        userNameHome.setText("Xin chào, " + quizPref.getName());
        cvHistory.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, HistoryActivity.class));
        });
        cvAbout.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this, AboutActivity.class));
        });
        cvStartQuiz.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, QuizOptionActivity.class));
        });
        cvLogout.setOnClickListener(v -> {
            // Tạo một AlertDialog.Builder
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Thông báo")
                    .setMessage("Bạn có chắc muốn đăng xuất? Dữ liệu sẽ bị xóa hoàn toàn!")
                    .setPositiveButton("OK", (dialog, which) -> {
                        quizPref.clearData();
                        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        dialog.dismiss();
                    })
                    .setNegativeButton("Cancel", (dialog, which) -> {
                        // Xử lý khi nút Cancel được nhấn
                        dialog.dismiss();
                    });
            // Tạo và hiển thị AlertDialog
            AlertDialog dialog = builder.create();
            dialog.show();
        });
    }

    public void initView() {
        cvStartQuiz = findViewById(R.id.cvStartQuiz);
        cvAbout = findViewById(R.id.cvAbout);
        cvHistory = findViewById(R.id.cvHistory);
        cvLogout = findViewById(R.id.cvLogout);
        userNameHome = (TextView) findViewById(R.id.tvUsernameHome);
        quizPref = QuizPref.getInstance();
    }
}