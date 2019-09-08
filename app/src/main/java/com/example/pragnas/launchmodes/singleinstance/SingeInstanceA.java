package com.example.pragnas.launchmodes.singleinstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class SingeInstanceA extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity a - SingleInstance mode,\n" +
                "goto Activity B - SingleInstance mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingeInstanceA.this, SingeInstanceB.class);
                startActivity(i);

            }
        });
    }
}
