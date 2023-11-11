package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rhombus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);
    }

    public void rhombus(View view) {
        EditText editText_diagonal_p = findViewById(R.id.editText_Diagonal_p);
        EditText editText_diagonal_q = findViewById(R.id.editText_Diagonal_q);
        TextView textView_rhombus_area= findViewById(R.id.textView_rhombus_area);
        Button button_rhombus = findViewById(R.id.button_rhombus);
        double diagonal_p = Double.parseDouble(editText_diagonal_p.getText().toString());
        double diagonal_q = Double.parseDouble(editText_diagonal_q.getText().toString());
        double multiple_0f_diagonals= diagonal_p*diagonal_q;
        double area_rhombus = 0.5*multiple_0f_diagonals;

        textView_rhombus_area.setText( ""+area_rhombus);
    }
}