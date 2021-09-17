package com.pekeyake.covid_know.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pekeyake.covid_know.core.model.CovidStats
import com.pekeyake.covid_know.R



class CovidStatsAdapter(val statsDaily:ArrayList<CovidStats>):RecyclerView.Adapter<CovidStatsAdapter.ViewHolder>()

{
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CovidStatsAdapter.ViewHolder
    {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_vaccine_sites,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: CovidStatsAdapter.ViewHolder, position: Int)
    {
        holder.bindItems(statsDaily[position])
    }

    override fun getItemCount(): Int {
        return statsDaily.size
    }
    inner class ViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView)
    {
        fun bindItems(dailystatstoday:CovidStats)
        {
            val newcovcase = itemView.findViewById(R.id.newCases) as TextView
            val newdeaths = itemView.findViewById(R.id.deaths) as TextView
            val nowoverAll = itemView.findViewById(R.id.overAll) as TextView

            newcovcase.text = "NEW INFECTIONS: " + dailystatstoday.new_cases
            newdeaths.text =  "NEW DEATHS: " + dailystatstoday.deaths
            nowoverAll.text =  "OVERALL STATS: " + dailystatstoday.over_all
        }

    }
}