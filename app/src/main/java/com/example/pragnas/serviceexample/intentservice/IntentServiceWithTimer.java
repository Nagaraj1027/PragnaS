package com.example.pragnas.serviceexample.intentservice;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.widget.Toast;

public class IntentServiceWithTimer extends IntentService {


    public IntentServiceWithTimer(String name) {
        super(name);
    }

    public IntentServiceWithTimer() {
        super("IntentServiceWithTimer");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        String message = intent.getStringExtra("KEY_INTENT");
        intent.setAction(IntentServiceExampleActivity.FILTER_ACTION_KEY);
        SystemClock.sleep(10000);
        String msg = " Updating UI Thread after a pause of 10 seconds " + message;
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent.putExtra("broadcastMessage", msg));

       //We can't update the Main thread from here(below Toast for an instance), Because Intent service will run on worker thread.
        //Toast.makeText(this, "Start Service", Toast.LENGTH_SHORT).show();
    }
}
