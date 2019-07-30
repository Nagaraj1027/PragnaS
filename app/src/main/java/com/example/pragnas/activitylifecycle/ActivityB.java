package com.example.pragnas.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.pragnas.R;

public class ActivityB extends AppCompatActivity {

    Button btnGotoActA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.e("Activity B in onCreate ", "Activity B in onCreate");
        btnGotoActA = (Button) findViewById(R.id.btnGotoActA);

        btnGotoActA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent to_activityb = new Intent(ActivityB.this, ActivityA.class);
                startActivity(to_activityb);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Activity B in onStart ", "Activity B in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity B in onResume ", "Activity B in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Activity B in onPause ", "Activity B in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Activity B in onStop ", "Activity B in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Activty B in onDestroy ", "Activity B in onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Activty B in onRestart ", "Activity B in onRestart");
    }
}
