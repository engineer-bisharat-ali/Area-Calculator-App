package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class circle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    @SuppressLint("SetTextI18n")
    public void calculate(View view) {
        EditText editText_radius = findViewById(R.id.editText_radius);
        TextView textView_area= findViewById(R.id.textView_area);
        Button button = findViewById(R.id.button);
        double radius = Double.parseDouble(editText_radius.getText().toString());
       double area_circle = (3.141)*radius*radius;
        textView_area.setText( "" +area_circle);
    }
}