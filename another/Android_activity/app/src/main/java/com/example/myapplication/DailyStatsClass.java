package com.example.myapplication;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import android.location.Location;

public class DailyStatsClass
{
    private String mId;
    private Date mDate;
    private String mDetails;
    private Location mProvince;
    private double mDailyStats;
    private String mLink;

    public String getId()
    {
        return mId;
    }
    public Date getDate()
    {
        return mDate;
    }
    public String getDetails()
    {
        return mDetails;
    }
    public Location getProvince()
    {
        return mProvince;
    }
    public double getDailyStats()
    {
        return mDailyStats;
    }
    public String getLink()
    {
        return mLink;
    }

    public DailyStatsClass(String id, Date date, String details, Location prov,double dailyStatistics, String link)
    {
        mId = id;
        mDate = date;
        mDetails = details;
        mProvince = prov;
        mDailyStats = dailyStatistics;
        mLink = link;
    }
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm",Locale.US);
        String dateString = sdf.format(mDate);
        return dateString + ": " + mDailyStats + mDetails;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof DailyStatsClass)
            return (((DailyStatsClass)obj).getId().contentEquals(mId));
        else
            return  false;
    }
}
