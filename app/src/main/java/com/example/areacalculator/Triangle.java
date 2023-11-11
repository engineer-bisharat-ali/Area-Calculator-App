package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }


    public void triangle_image(View view) {
        EditText editText_base = findViewById(R.id.editText_base);
        EditText editText_height = findViewById(R.id.editText_height);
        TextView textView_triangle_area =findViewById(R.id.textView_triangle_area);
        double base = Double.parseDouble(editText_base.getText().toString());
        double height = Double.parseDouble(editText_height.getText().toString());
       double multiply_of_base_height_triangle = base * height;
       double area_of_triangle = 0.5*multiply_of_base_height_triangle;
       textView_triangle_area.setText(area_of_triangle+"");
    }
}