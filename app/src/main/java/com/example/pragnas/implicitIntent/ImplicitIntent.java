package com.example.pragnas.implicitIntent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pragnas.MainActivity;
import com.example.pragnas.R;

public class ImplicitIntent extends AppCompatActivity implements View.OnClickListener {

    Button gotoDialAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        gotoDialAct = (Button) findViewById(R.id.gotoDialAct);

        gotoDialAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.gotoDialAct:
                gotoImplicitIntent();
                break;
        }
    }

    void gotoImplicitIntent() {
        Intent to_phone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9550575406"));
        startActivity(to_phone);
    }
}
