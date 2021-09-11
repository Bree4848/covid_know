package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.ViewGroup;

public class vaccinationSites extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccinationsites);

        Spinner myProvince = (Spinner) findViewById(R.id.province);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.province_names, android.R.layout.simple_dropdown_item_1line);
        myProvince.setAdapter(adapter1);

        Spinner myDistrict = (Spinner) findViewById(R.id.district);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.district_names, android.R.layout.simple_dropdown_item_1line);
        myDistrict.setAdapter(adapter2);
        //myDistrict.setOnItemClickListener(listener);

        Spinner myLocalMunicipality = (Spinner) findViewById(R.id.municipality);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.municipality_names, android.R.layout.simple_dropdown_item_1line);
        myLocalMunicipality.setAdapter(adapter3);

        Spinner myWard = (Spinner) findViewById(R.id.ward);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.ward_number, android.R.layout.simple_dropdown_item_1line);
        myWard.setAdapter(adapter4);

        Button btnShow = (Button)findViewById(R.id.buttonCheck);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(vaccinationSites.this, "SORRY, OPTION COMING SOON", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
