package com.hadimusthafa.zoondia12;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.json.JSONArray;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;


    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs, int behavior) {
        super(fm, behavior);
        this.mNumOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}