package com.pekeyake.covid_know

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.widget.RelativeLayout

class SplashScreen : AppCompatActivity()
{
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val background :RelativeLayout = findViewById(R.id.relativelay)
        background.setBackgroundColor(Color.DKGRAY)

        Handler().postDelayed(
            {
                val i = Intent(this@SplashScreen, HomeActivity::class.java)
                startActivity(i)
                finish()
            }, SPLASH_TIME_OUT)

    }
}