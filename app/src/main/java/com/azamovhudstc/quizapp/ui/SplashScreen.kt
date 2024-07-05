package com.azamovhudstc.quizapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.azamovhudstc.quizapp.database.QuizPref

class SplashScreen : AppCompatActivity() {
    private lateinit var quizPref: QuizPref
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        // khởi tạo SharedPreferences dùng để lưu lịch sử, thông tin đăng nhập,...
        quizPref = QuizPref.getInstance()

        Handler().postDelayed({
            // Kiểm tra xem trong database đã có user name chưa, nếu chưa thì vào màn login, nếu có thì vào màn home
            if (quizPref.name.isEmpty()) {
                startActivity(Intent(this, LoginActivity::class.java))
            } else {
                startActivity(Intent(this, HomeActivity::class.java))
            }
            finish()
        }, 1000)
    }
}