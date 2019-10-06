package com.example.pragnas.serviceexample.intentservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pragnas.R;

public class IntentServiceExampleActivity extends AppCompatActivity {
    Button btnIntentService;
    TextView tvUpdatedValue;

    TimerBroadcast myReceiver;
    public static final String FILTER_ACTION_KEY = "any_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intent_service_example);
        btnIntentService = (Button) findViewById(R.id.btnIntentService);
        tvUpdatedValue = (TextView) findViewById(R.id.tvUpdatedValue);

        btnIntentService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvUpdatedValue.setText("Timer is running, Wait for 10 Sec");
                Intent i = new Intent(IntentServiceExampleActivity.this, IntentServiceWithTimer.class);
                i.putExtra("KEY_INTENT", "TIMER");
                startService(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        setReceiver();
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myReceiver);
    }

    private void setReceiver() {
        myReceiver = new TimerBroadcast();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(FILTER_ACTION_KEY);

        LocalBroadcastManager.getInstance(this).registerReceiver(myReceiver, intentFilter);
    }

    class TimerBroadcast extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra("broadcastMessage");
            tvUpdatedValue.setText("Message from Intent service. " + "\n" + message);
        }
    }
}
