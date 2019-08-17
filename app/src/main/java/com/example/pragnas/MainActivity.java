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
import com.example.pragnas.dynamicfragments.FragmenTabsActivity;
import com.example.pragnas.alertdialog.ExampleDialog;
import com.example.pragnas.explicitintent.IntentActivity;
import com.example.pragnas.implicitIntent.ImplicitIntent;
import com.example.pragnas.listview.ListviewActivity;
import com.example.pragnas.recyclerview.RecyclerViewExample;
import com.example.pragnas.sensors.ProximitySensorActivity;
import com.example.pragnas.staticfragment.StaticFragmentsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnExplicitIntent, btn2, btn3, btnGotoActLifecycle,
            btnForAlertDialog, btnGotoStaticFragmnts, btnFragmntsWithTabs,
            btnListview, btnRecyclerview, btnProximity;
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
        btnGotoStaticFragmnts = findViewById(R.id.btnGotoStaticFragmnts);
        btnFragmntsWithTabs = findViewById(R.id.btnFragmntsWithTabs);
        btnForAlertDialog = findViewById(R.id.btnForAlertDialog);
        toolbar = findViewById(R.id.toolbar);
        btnListview = findViewById(R.id.btnListview);
        btnRecyclerview = findViewById(R.id.btnRecyclerview);
        btnProximity = findViewById(R.id.btnProximity);

        btnExplicitIntent.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnGotoActLifecycle.setOnClickListener(this);
        btnGotoStaticFragmnts.setOnClickListener(this);
        btnFragmntsWithTabs.setOnClickListener(this);
        btnForAlertDialog.setOnClickListener(this);
        setSupportActionBar(toolbar);
        btnListview.setOnClickListener(this);
        btnRecyclerview.setOnClickListener(this);
        btnProximity.setOnClickListener(this);

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
            case R.id.btnFragmntsWithTabs:
                // Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
                gotoDynamicFragmnts();
                break;
            case R.id.btnProximity:
                // Toast.makeText(getApplicationContext(), "Button3 Clicked", Toast.LENGTH_LONG).show();
                gotoButtonProximity();
                break;


            case R.id.btnForAlertDialog:
                showAlertDialog();
                break;
            case R.id.btnListview:
                gotoListView();
                break;
            case R.id.btnRecyclerview:
                gotoRecyclerVeiw();
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

    void gotoStaticFragmnts() {
        Intent to_staticFragmnts = new Intent(MainActivity.this, StaticFragmentsActivity.class);
        startActivity(to_staticFragmnts);
    }

    void gotoDynamicFragmnts() {
        Intent to_staticFragmnts = new Intent(MainActivity.this, FragmenTabsActivity.class);
        startActivity(to_staticFragmnts);
    }

    void gotoListView() {
        Intent to_lisview = new Intent(MainActivity.this, ListviewActivity.class);
        startActivity(to_lisview);
    }

    void gotoRecyclerVeiw() {
        Intent to_recycler = new Intent(MainActivity.this, RecyclerViewExample.class);
        startActivity(to_recycler);
    }

    void gotoButtonProximity() {
        Intent to_recycler = new Intent(MainActivity.this, ProximitySensorActivity.class);
        startActivity(to_recycler);
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
