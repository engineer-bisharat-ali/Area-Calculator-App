package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Sector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sector);
    }


    public void sector(View view) {
        EditText sector_radius= findViewById(R.id.editText_sector_radius);
        EditText sector_angle = findViewById(R.id.editText_Angle);
        TextView textView_sector_area =findViewById(R.id.textView_Sector_area);
        double radius = Double.parseDouble(sector_radius.getText().toString());
        double angle = Double.parseDouble(sector_angle.getText().toString());
        double multiplication_of_pi_degee = angle * 0.01745;
        double area_of_sector = 0.5 * radius*radius*multiplication_of_pi_degee;
        textView_sector_area.setText(area_of_sector+"");



    }
}