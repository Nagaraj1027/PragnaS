package com.example.pragnas.launchmodes.singleinstance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class SingeInstanceE extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singe_instance_e);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity e - SingleInstance mode,\n" +
                "back press - should goto C as its SingleInstance");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent i = new Intent(SingeInstanceD.this, SingeInstanceE.class);
                startActivity(i);*/

            }
        });

    }
}
