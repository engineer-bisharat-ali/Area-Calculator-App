package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);

    }

    public void formula_of_Circle(View view) {
        Intent intent = new Intent(this,formula_page_of_circle.class);
        startActivity(intent);
    }

    public void formula_of_rectangle(View view) {
        Intent intent = new Intent(this,formula_page_of_Rectangle.class);
        startActivity(intent);
    }

    public void formula_of_triangle(View view) {
        Intent intent = new Intent(this,formula_page_of_triangle.class);
        startActivity(intent);
    }

    public void formula_of_rhombus(View view) {
        Intent intent = new Intent(this,formula_page_of_rhombus.class);
        startActivity(intent);
    }

    public void formula_of_Square(View view) {
        Intent intent = new Intent(this,formula_page_of_Square.class);
        startActivity(intent);
    }

    public void formula_of_sector(View view) {
        Intent intent = new Intent(this,formula_page_of_Sector.class);
        startActivity(intent);
    }
}