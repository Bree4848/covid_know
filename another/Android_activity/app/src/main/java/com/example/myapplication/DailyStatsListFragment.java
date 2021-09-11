package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class DailyStatsListFragment extends Fragment
{
    private ArrayList<DailyStatsClass> mDailyStats = new ArrayList<DailyStatsClass>();

    public DailyStatsListFragment()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_dailystats_list,container,false);
        return view;
    }
}
