package com.pekeyake.covid_know

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pekeyake.covid_know.adapter.CovidStatsAdapter
import com.pekeyake.covid_know.core.model.CovidStats

class DailyStats : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_stats)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val shareButton = findViewById<Button>(R.id.share)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val dailystatstoday = ArrayList<CovidStats>()

        dailystatstoday.add(CovidStats("6566","235","1 458 555"))
        dailystatstoday.add(CovidStats("6126","155","1 958 555"))
        dailystatstoday.add(CovidStats("4556","235","2 458 555"))

        val adapter = CovidStatsAdapter(dailystatstoday)
        recyclerView.adapter = adapter
    }
}