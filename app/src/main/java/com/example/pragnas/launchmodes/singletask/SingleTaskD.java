package com.example.pragnas.launchmodes.singletask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class SingleTaskD extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity D - SingleTask mode,\n" +
                "goto Activity B - SingleTask mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingleTaskD.this, SingleTaskB.class);

                startActivity(i);
            }
        });
    }
}
