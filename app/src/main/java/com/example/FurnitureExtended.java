package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class FurnitureExtended extends AppCompatActivity {
    private Intent intent;
    private ImageView ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, back;
    private Button sofas, seating, chairs, tables, cabinetry, dining, beds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_extended);
        initViews();
    }

    public void initViews() {

        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        back = findViewById(R.id.imBack);
        sofas=findViewById(R.id.Sofas);
        seating=findViewById(R.id.Seating);
        chairs=findViewById(R.id.Chairs);
        tables=findViewById(R.id.Tables);
        cabinetry=findViewById(R.id.Cabinetry);
        dining=findViewById(R.id.DiningAndBars);
        beds=findViewById(R.id.Beds);
        sofas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, SofasActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, WhishList.class);
                startActivity(intent);
                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(FurnitureExtended.this, Furniture.class);
                startActivity(intent);
                finish();
            }
        });
    }
}