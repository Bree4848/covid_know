package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends Activity
{
    private long ms=0;
    private long splashTime=3000;
    private boolean splashActive = true;
    private boolean paused = false;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_splash);

        Thread myThread = new Thread()
        {
            public void run()
            {
                try
                {
                    while (splashActive && ms < splashTime)
                    {
                        if(!paused)
                            ms=ms+100;
                        sleep(100);
                    }
                }catch (Exception e){}
             finally {
                    Intent intent = new Intent(splashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        myThread.start();

    }
}
