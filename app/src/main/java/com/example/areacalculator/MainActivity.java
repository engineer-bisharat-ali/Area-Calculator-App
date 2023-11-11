package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // open the circle activity
    public void circle_image(View view) {
        Intent intent = new Intent(this,circle.class);
        startActivity(intent);

    }
    // open the rectangle activity
    public void rectangle_image(View view) {
        Intent intent =new Intent(this,Rectangle.class);
        startActivity(intent);
    }

    // open the triangle activity
    public void triangle_image_click(View view){
        Intent intent = new Intent(this,Triangle.class);
        startActivity(intent);
    }

    public void rhombus_image_click(View view) {
        Intent intent = new Intent(this,Rhombus.class);
        startActivity(intent);
    }

    public void square_image_click(View view) {
        Intent intent = new Intent(this,Square.class);
        startActivity(intent);
    }

    public void sector_image_click(View view) {
        Intent intent = new Intent(this,Sector.class);
        startActivity(intent);
    }

    public void formula(View view) {
        Intent intent = new Intent(this,formula.class);
        startActivity(intent);

    }
}