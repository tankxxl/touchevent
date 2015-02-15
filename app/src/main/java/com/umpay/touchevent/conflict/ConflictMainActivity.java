package com.umpay.touchevent.conflict;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;

import com.umpay.touchevent.R;

import java.util.ArrayList;

public class ConflictMainActivity extends ActionBarActivity {
    private MyViewPager pager;
    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_conflict_main);
        getSupportActionBar().setTitle("Conflict touch");

        mFragmentManager = this.getSupportFragmentManager();
        pager = (MyViewPager) this.findViewById(R.id.viewpager);
        FixedPagerAdapter adpater = new FixedPagerAdapter(this, mFragmentManager, pager);
        ArrayList<String> lists = new ArrayList<String>();
        lists.add(FirstFragment.class.getName());
        lists.add(TwoFragment.class.getName());
        adpater.setFragments(lists);
        pager.setAdapter(adpater);

    }

}
