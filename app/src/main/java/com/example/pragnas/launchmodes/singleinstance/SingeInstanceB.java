package com.example.pragnas.launchmodes.singleinstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class SingeInstanceB extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity b - SingleInstance mode,\n" +
                "goto Activity c - SingleInstance mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingeInstanceB.this, SingeInstanceC.class);
                startActivity(i);

            }
        });
    }
}
