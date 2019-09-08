package com.example.pragnas.launchmodes.standardmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class StandardModeA extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity a - Standard mode,\n" +
                "goto Activity B - standard mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StandardModeA.this, StandardModeB.class);
                startActivity(i);

            }
        });
    }
}
