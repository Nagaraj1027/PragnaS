package com.example.pragnas.launchmodes.singletop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class SingleTopC extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity c - SingleTop mode,\n" +
                "goto Activity d - SingleTop mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTopC.this, SingleTopD.class);
                startActivity(i);

            }
        });
    }
}
