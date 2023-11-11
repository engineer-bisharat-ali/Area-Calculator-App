package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Square extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }



    public void square(View view) {
        EditText editText_side = findViewById(R.id.editText_side);
        TextView textView_area_square = findViewById(R.id.textView_Square_area);
        double side = Double.parseDouble(editText_side.getText().toString());
        double area_of_square = side*side;
        textView_area_square.setText(area_of_square+"");
    }
}