package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
    }

    @SuppressLint("SetTextI18n")
    public void rectangle(View view) {
        EditText editText_length = findViewById(R.id.editText_length);
        EditText editText_width = findViewById(R.id.editText_width);
        TextView textView_rectangle_area= findViewById(R.id.textView_rectangle_area);
        Button button_rectangle = findViewById(R.id.button_rectangle);
        double length = Double.parseDouble(editText_length.getText().toString());
        double width = Double.parseDouble(editText_width.getText().toString());
        double area_rectangle = length*width;

        textView_rectangle_area.setText( ""+area_rectangle);
    }
}