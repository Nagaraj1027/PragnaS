package com.example.pragnas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        initViews();
    }

    void initViews() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
/*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Button1 Clicked", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button2 Clicked", Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "Button1 is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "Button2 Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
