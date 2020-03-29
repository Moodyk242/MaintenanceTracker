package com.autoauto.maintenancetracker;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class AboutVehicleActivity extends AutoAutoActivity {
    TextView tvCarName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_vehicle);

        tvCarName = findViewById(R.id.tvCarName);
        int index = getIntent().getIntExtra("car_index", -1);
        if (index != -1) {
            String[] carArray = application.getMyGarage().getCarsArray();
            tvCarName.setText(carArray[index]);
        }
    }

    public void onButtonClick(View view) {
        Intent myIntent = new Intent(getBaseContext(),EditVehActivity.class);
        startActivity(myIntent);
    }
}
