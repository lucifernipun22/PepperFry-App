package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pepperfry.R;

public class ProfileSection extends AppCompatActivity {
private Button mBTNMyOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_section);
        mBTNMyOrder=  findViewById(R.id.btnMyOrder);
        mBTNMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileSection.this, ProfileExtendedMyOrder.class);
                startActivity(intent);
            }
        });
    }
}