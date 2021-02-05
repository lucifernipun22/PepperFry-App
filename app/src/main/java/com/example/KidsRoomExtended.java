package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class KidsRoomExtended extends AppCompatActivity {
    private Intent intent;
    private ImageView ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, back;
    private Button sofas, seating, chairs, tables, cabinetry, dining, beds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_room_extended);
        initViews();
    }

    public void initViews() {

        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        back = findViewById(R.id.imBack);
        sofas=findViewById(R.id.Beds);
        seating=findViewById(R.id.Tables);
        chairs=findViewById(R.id.Cabinetry);
        tables=findViewById(R.id.Seating);
        cabinetry=findViewById(R.id.Decor);
        dining=findViewById(R.id.Bedding);
        beds=findViewById(R.id.Furnishing);
        cabinetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, Decor.class);
                startActivity(intent);
                finish();
            }
        });
        beds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, Furnishings.class);
                startActivity(intent);
                finish();
            }
        });
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, WhishList.class);
                startActivity(intent);
                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(KidsRoomExtended.this, Furniture.class);
                startActivity(intent);
                finish();
            }
        });
    }
}