package com.azamovhudstc.quizapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.azamovhudstc.quizapp.R;
import com.azamovhudstc.quizapp.database.QuizPref;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {
    TextView textInputEditText;
    MaterialButton btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // gán view
        textInputEditText = findViewById(R.id.tiePassword);
        btn = findViewById(R.id.btnLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textInputEditText.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Tên không được để trống", Toast.LENGTH_SHORT).show();
                } else {
                    QuizPref quizPref = QuizPref.getInstance();
                    quizPref.saveName(textInputEditText.getText().toString());
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    finish();
                }
            }
        });
    }
}
