package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.time.Instant;

public class Splash_screen extends AppCompatActivity {

    TextView text_splash_anim;
    LinearLayout linearLayout;
    ImageView splash_area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        text_splash_anim=findViewById(R.id.text_splash_anim);
        linearLayout=findViewById(R.id.linear_layout_splash_anim);

//        Animation linear_layout_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.linaer_layout_anim);
//        linearLayout.startAnimation(linear_layout_anim);

        Animation text_anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.area_cal_splash_anim);
        text_splash_anim.startAnimation(text_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_screen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}