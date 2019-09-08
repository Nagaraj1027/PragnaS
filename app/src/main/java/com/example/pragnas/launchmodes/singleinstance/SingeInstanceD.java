package com.example.pragnas.launchmodes.singleinstance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pragnas.R;

public class SingeInstanceD extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity d - SingleInstance mode,\n" +
                "goto Activity e - SingleInstance mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SingeInstanceD.this, SingeInstanceE.class);
                startActivity(i);

                Toast.makeText(SingeInstanceD.this, "Activity D is Created its seperate instnace as its SingleInstance", Toast.LENGTH_LONG).show();

            }
        });
    }
}
