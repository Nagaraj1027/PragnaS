package com.example.pragnas.launchmodes.standardmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pragnas.R;

public class StandardModeD extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btn = (Button) findViewById(R.id.btn);

        btn.setText("In Activity D - Standard mode,\n" +
                "goto Activity B - standard mode");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch B again from D, ActvivityB would be reLaunched again as it is standard mode
                Intent i=new Intent(StandardModeD.this, StandardModeB.class);
                startActivity(i);

                Toast.makeText(StandardModeD.this, "Activity B is recreated again as it is Standard mode", Toast.LENGTH_LONG).show();

            }
        });
    }
}
