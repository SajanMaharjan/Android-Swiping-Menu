package com.example.sajan.swipemenu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Sajan on 15-Jun-16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {


    ArrayList<Fragment> fragments = new ArrayList<>();
    ArrayList<String> tabTiltles = new ArrayList<>();

    public void addFragments(Fragment fragments, String titles)
    {
        this.fragments.add(fragments);
        this.tabTiltles.add(titles);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTiltles.get(position);
    }
}
