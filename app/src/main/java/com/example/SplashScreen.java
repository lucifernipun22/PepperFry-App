package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.pepperfry.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    Animation topAnim;
    Animation bottomAnim;
    ImageView image1;
    ImageView image2;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,LoginOrRegister.class);
                startActivity(intent);
                finish();
            }
        },4000);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        image2=findViewById(R.id.design);
        image2.setAnimation(bottomAnim);
        image1=findViewById(R.id.logo);
        image1.setAnimation(topAnim);


    }
}
