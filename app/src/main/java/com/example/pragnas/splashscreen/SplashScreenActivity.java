package com.example.pragnas.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pragnas.MainActivity;
import com.example.pragnas.R;
import com.example.pragnas.appclass.ApplicationClass;
import com.example.pragnas.login.LoginActivity;

public class SplashScreenActivity extends AppCompatActivity {
    int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                checkLoginStatus();
            }
        }, SPLASH_TIME_OUT);
    }

    void checkLoginStatus() {
        if (ApplicationClass.getLoginStatusFromSharedPreferences()) {
            //goto HomeScreen
            Intent to_relative = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(to_relative);
            finish();
        } else {
            //goto LOgin
            Intent to_relative = new Intent(SplashScreenActivity.this, LoginActivity.class);
            startActivity(to_relative);
            finish();
        }
    }
}
