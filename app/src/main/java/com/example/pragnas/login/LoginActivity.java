package com.example.pragnas.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pragnas.MainActivity;
import com.example.pragnas.R;
import com.example.pragnas.activitylifecycle.ActivityA;
import com.example.pragnas.appclass.ApplicationClass;
import com.example.pragnas.explicitintent.IntentActivity;
import com.example.pragnas.implicitIntent.ImplicitIntent;

public class LoginActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Log.e("onCreate LoginActivity", "onCreate LoginActivity");
        initViews();
    }

    void initViews() {
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(username.getText().toString().isEmpty()) && !(password.getText().toString().isEmpty())) {

                    Log.e("un",username.getText().toString());

                    Log.e("pw",password.getText().toString());

/*
                    ApplicationClass.putUserNameIntoPreferences(username.getText().toString());
*/

                 /* ApplicationClass.putPasswordIntoPreferences(password.getText().toString());*/

                 /*   Log.e("username From Pref", ApplicationClass.getUserNameFromSharedPreferences());*/
                    /*Log.e("password From Pref", ApplicationClass.getPasswordFromSharedPreferences());*/

                    Intent to_relative = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(to_relative);
                }
            }
        });
    }
}
