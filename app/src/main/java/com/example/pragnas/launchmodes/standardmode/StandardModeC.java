package com.example.pragnas.launchmodes.standardmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class StandardModeC extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity c - Standard mode,\n" +
                "goto Activity D - standard mode");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(StandardModeC.this, StandardModeD.class);
                startActivity(i);

            }
        });
    }
}
