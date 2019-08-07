package com.example.pragnas.dynamicfragments.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pragnas.dynamicfragments.FragmentOne;
import com.example.pragnas.dynamicfragments.FragmentSecond;
import com.example.pragnas.dynamicfragments.FragmentThird;

/**
 * Created by nagarajpambhala on 25/1/2019.
 */

public class CreateDynamicFragments extends FragmentStatePagerAdapter {
    int value;

    public CreateDynamicFragments(FragmentManager fm, int value) {
        super(fm);
        this.value = value;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentOne.newInstance("param1", "param2");
            case 1:
                return FragmentSecond.newInstance("param1", "param2");
            case 2:
                return FragmentThird.newInstance("param1", "param2");
        }
        return null;
    }


    @Override
    public int getCount() {
        return value;
    }
}
