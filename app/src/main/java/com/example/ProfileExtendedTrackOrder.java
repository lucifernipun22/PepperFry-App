package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class ProfileExtendedTrackOrder extends AppCompatActivity {
    private ImageView back;
    private Button startShopping;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_extended_track_order);
        initView();
    }

    private void initView() {
        back = findViewById(R.id.imBack);
        startShopping = findViewById(R.id.BtnStartShoping);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileExtendedTrackOrder.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
        startShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileExtendedTrackOrder.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

    }
}