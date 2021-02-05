package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class MattressesExtended extends AppCompatActivity {
    private Intent intent;
    private ImageView ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mattresses_extended);
        initViews();
    }

    public void initViews() {

        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        back = findViewById(R.id.imBack);
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, WhishList.class);
                startActivity(intent);
                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, Furniture.class);
                startActivity(intent);
                finish();
            }
        });
    }
}