package com.example.pragnas.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pragnas.MainActivity;
import com.example.pragnas.R;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnGotoMainAct;
    TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        initViews();
    }

    void initViews() {
        btnGotoMainAct = (Button) findViewById(R.id.btnGotoMainAct);
        tvHello = (TextView) findViewById(R.id.tvHello);

        btnGotoMainAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnGotoMainAct:
                gotoMainAct();
                break;
        }
    }

    void gotoMainAct() {
        Intent to_main = new Intent(IntentActivity.this, MainActivity.class);
        startActivity(to_main);
    }
}
