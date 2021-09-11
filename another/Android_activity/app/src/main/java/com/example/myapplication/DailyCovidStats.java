package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class DailyCovidStats extends AppCompatActivity
{
    private static final String TAG_LIST_FRAGMENT = "TAG_LIST_FRAGMENT";

    DailyStatsListFragment myListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_covid_stats);

        FragmentManager fm = getSupportFragmentManager();
        if(savedInstanceState==null)
        {
            FragmentTransaction ft = fm.beginTransaction();

            myListFragment = new DailyStatsListFragment();
            ft.add(R.id.dailyStatsActivityMain,myListFragment, TAG_LIST_FRAGMENT);

            ft.commitNow();
        }
        else
        {
            myListFragment = (DailyStatsListFragment)fm.findFragmentByTag(TAG_LIST_FRAGMENT);
        }
    }
}