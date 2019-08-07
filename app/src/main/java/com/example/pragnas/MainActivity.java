package com.example.pragnas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pragnas.activitylifecycle.ActivityA;
import com.example.pragnas.alertdialog.ExampleDialog;
import com.example.pragnas.explicitintent.IntentActivity;
import com.example.pragnas.implicitIntent.ImplicitIntent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnExplicitIntent, btn2, btn3, btnGotoActLifecycle, btnForAlertDialog;
    Toolbar toolbar;

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
        btnForAlertDialog = findViewById(R.id.btnForAlertDialog);
        toolbar = findViewById(R.id.toolbar);


        btnExplicitIntent.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnGotoActLifecycle.setOnClickListener(this);
        btnForAlertDialog.setOnClickListener(this);
        setSupportActionBar(toolbar);

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

            case R.id.btnForAlertDialog:
                showAlertDialog();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflator = getMenuInflater();
        mMenuInflator.inflate(R.menu.my_menu, menu);
        return true;
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

    void showAlertDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "xyz");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_setting:
                Toast.makeText(getApplicationContext(), "you clicked settings menu", Toast.LENGTH_LONG).show();
                break;

            case R.id.action_about_us:
                Toast.makeText(getApplicationContext(), "you clicked About us menu", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
