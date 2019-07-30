package com.example.pragnas.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.MainActivity;
import com.example.pragnas.R;

public class ActivityA extends AppCompatActivity {

    Button btnGotoActB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        btnGotoActB = (Button) findViewById(R.id.btnGotoActB);

        btnGotoActB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent to_activitya = new Intent(ActivityA.this, ActivityB.class);
                startActivity(to_activitya);
            }
        });

        Log.e("Activity A in onCreate ", "Activity A in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity A in onStart ", "Activity A in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity A in onResume ", "Activity A in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity A in onPause ", "Activity A in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity A in onStop ", "Activity A in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activty A in onDestroy ", "Activity A in onDestroy");
    }
}
