package com.example.pragnas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pragnas.activitylifecycle.ActivityA;
import com.example.pragnas.explicitintent.IntentActivity;
import com.example.pragnas.implicitIntent.ImplicitIntent;
import com.example.pragnas.staticfragment.StaticFragmentsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnExplicitIntent, btn2, btn3, btnGotoActLifecycle, btnGotoStaticFragmnts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        initViews();
    }

    void initViews() {
        btnExplicitIntent = findViewById(R.id.btnExplicitIntent);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnGotoActLifecycle = findViewById(R.id.btnGotoActLifecycle);
        btnGotoStaticFragmnts = findViewById(R.id.btnGotoStaticFragmnts);


        btnExplicitIntent.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnGotoActLifecycle.setOnClickListener(this);
        btnGotoStaticFragmnts.setOnClickListener(this);

/*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Button1 Clicked", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button2 Clicked", Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
            }
        });*/
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnExplicitIntent:
                //Toast.makeText(getApplicationContext(), "Button1 is clicked", Toast.LENGTH_LONG).show();
                gotoExplicitIntent();
                break;
            case R.id.btn2:
                gotoImplicitIntent();
                //Toast.makeText(getApplicationContext(), "Button2 Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btnGotoActLifecycle:
                // Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
                gotoActivityLifeCycle();
                break;
            case R.id.btnGotoStaticFragmnts:
                // Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
                gotoStaticFragmnts();
                break;


        }
    }

    void gotoExplicitIntent() {
        Intent to_explicit = new Intent(MainActivity.this, IntentActivity.class);
        startActivity(to_explicit);
    }

    void gotoImplicitIntent() {
        Intent to_implicit = new Intent(MainActivity.this, ImplicitIntent.class);
        startActivity(to_implicit);
    }

    void gotoActivityLifeCycle() {
        Intent to_activitya = new Intent(MainActivity.this, ActivityA.class);
        startActivity(to_activitya);
    }

    void gotoStaticFragmnts() {
        Intent to_staticFragmnts = new Intent(MainActivity.this, StaticFragmentsActivity.class);
        startActivity(to_staticFragmnts);
    }

}
