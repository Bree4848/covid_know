package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button vaccineFActsVele = (Button) findViewById(R.id.vacFacts);
        Button covidNewsButton = (Button) findViewById(R.id.covidNewsButton);
        Button vaccineFacts =(Button) findViewById(R.id.covidNewsButton);

        vaccineFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.example.myapplication.vaccineFacts"));
            }
        });

        vaccineFActsVele.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity( new Intent("com.example.myapplication.vaccineFacts"));
            }
        });
        covidNewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent("com.example.myapplication.VaccineNews"));
            }
        });
    }
    public void onClick(View view)
    {
        startActivity( new Intent("com.example.myapplication.vaccinationSites"));
    }
}