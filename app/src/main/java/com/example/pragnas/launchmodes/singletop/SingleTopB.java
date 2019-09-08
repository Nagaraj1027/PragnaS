package com.example.pragnas.launchmodes.singletop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class SingleTopB extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity b - SingleTop mode,\n" +
                "goto Activity c - SingleTop mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTopB.this, SingleTopC.class);
                startActivity(i);

            }
        });

    }
}
