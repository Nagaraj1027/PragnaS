package com.example.pragnas.dynamicfragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.example.pragnas.R;
import com.example.pragnas.dynamicfragments.adapter.CreateDynamicFragments;

public class FragmenTabsActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    CreateDynamicFragments dynamicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        findViews();
        setAdapter();
    }

    private void findViews() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
    }

    private void setAdapter() {

        dynamicAdapter = new CreateDynamicFragments(getSupportFragmentManager(), 3);
        viewPager.setAdapter(dynamicAdapter);

        tabLayout.setupWithViewPager(viewPager);  //Attach TabLayout with viewpager

        //viewPager.setOffscreenPageLimit(2);

        setupTabNames(3);  //Set

    }

    private void setupTabNames(int number) {
        for (int i = 0; i < number; i++) {
            tabLayout.getTabAt(i).setText("TAB" + i);
        }
    }
}
