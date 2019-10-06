package com.example.pragnas.serviceexample.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pragnas.R;
import com.example.pragnas.serviceexample.intentservice.IntentServiceExampleActivity;
import com.example.pragnas.serviceexample.intentservice.IntentServiceWithTimer;

public class ServiceExampleActivity extends AppCompatActivity {

    Button btnStartService, btnStopService;
    TextView tvUpdatedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_example);

        btnStartService = (Button) findViewById(R.id.btnStartService);
        btnStopService = (Button) findViewById(R.id.btnStopService);
        tvUpdatedValue = (TextView) findViewById(R.id.tvUpdatedValue);

        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServiceExampleActivity.this, ServiceWithTimer.class);
                i.putExtra("KEY_INTENT", "TIMER");
                startService(i);
            }
        });

        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ServiceExampleActivity.this, ServiceWithTimer.class);
                stopService(i);
            }
        });
    }
}
