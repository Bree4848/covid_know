package com.pekeyake.covid_know

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.common.base.FinalizableWeakReference
import com.google.firebase.firestore.FirebaseFirestore
import com.pekeyake.covid_know.adapter.CovidStatsAdapter
import com.pekeyake.covid_know.core.model.CovidStats
import com.google.android.gms.ads.MobileAds

class DailyStats : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_stats)

        //MobileAds.initialize(this) {}

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val shareButton = findViewById<Button>(R.id.share)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val firebaseFireStore = FirebaseFirestore.getInstance()
        firebaseFireStore.collection("covidknow")
            .get()

        val dailystatstoday = ArrayList<CovidStats>()

        dailystatstoday.add(CovidStats("6566","235","1 458 555"))
        dailystatstoday.add(CovidStats("6126","155","1 958 555"))
        dailystatstoday.add(CovidStats("4556","235","2 458 555"))

        val adapter = CovidStatsAdapter(dailystatstoday)
        recyclerView.adapter = adapter
    }
}