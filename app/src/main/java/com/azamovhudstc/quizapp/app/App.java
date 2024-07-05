package com.azamovhudstc.quizapp.app;

import android.app.Application;
import com.azamovhudstc.quizapp.database.QuizPref;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // khởi tạo database
        QuizPref.init(this);
    }
}
