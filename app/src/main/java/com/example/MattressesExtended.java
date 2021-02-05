package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class MattressesExtended extends AppCompatActivity {
    private Intent intent;
    private ImageView ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, back;
    private Button sofas, seating, chairs, tables;
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
        sofas=findViewById(R.id.btnMattresses1);
        seating=findViewById(R.id.btnMattresses2);
        chairs=findViewById(R.id.btnMattresses3);
        tables=findViewById(R.id.btnMattresses4);
        sofas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, Mattresses.class);
                startActivity(intent);
                finish();
            }
        });
        seating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, Mattresses.class);
                startActivity(intent);
                finish();
            }
        });
        chairs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, Mattresses.class);
                startActivity(intent);
                finish();
            }
        });
        tables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MattressesExtended.this, Mattresses.class);
                startActivity(intent);
                finish();
            }
        });
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