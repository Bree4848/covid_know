package com.pekeyake.covid_know

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.initialization.InitializationStatus
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class HomeActivity : AppCompatActivity()
{
    lateinit var toggle : ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        MobileAds.initialize(this) {}

        val mAdView: AdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val vaccineSites: Button = findViewById(R.id.vaccinesites)
        val dailySites: Button = findViewById(R.id.dailystats)
        val covidNews: Button = findViewById(R.id.covidnews)
        val vaccineFacts: Button = findViewById(R.id.vaccine_facts)

        val drawerlayout: DrawerLayout = findViewById(R.id.drawerlayout)
        val navView : NavigationView = findViewById(R.id.navigationview)

        vaccineSites.setOnClickListener {
            val intent = Intent(this,VaccineSites::class.java)
            startActivity(intent)
        }
        dailySites.setOnClickListener {
            val intent = Intent(this,DailyStats::class.java)
            startActivity(intent)
        }
        vaccineFacts.setOnClickListener {
            val intent = Intent(this, VaccineFacts::class.java)
            startActivity(intent)
        }
        covidNews.setOnClickListener {
            val intent = Intent(this,CovidNews::class.java)
            startActivity(intent)
        }

        toggle = ActionBarDrawerToggle(this,drawerlayout,R.string.open, R.string.close)

        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked home",Toast.LENGTH_SHORT).show()
            }
            true

            when(it.itemId){
                R.id.nav_home  -> Toast.makeText(applicationContext,"Clicked home",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {

        if(toggle.onOptionsItemSelected(item)) {
            return true
        }

            return super.onOptionsItemSelected(item)

    }
}