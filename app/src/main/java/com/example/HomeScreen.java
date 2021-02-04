package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/*import com.example.pepperfry.R;*/

public class HomeScreen extends AppCompatActivity {
    private ImageView ivFurniture;
    private ImageView ivLiving;
    private ImageView ivBedroom;
    private ImageView ivKidsRoom;
    private ImageView ivMattresses;
    private ImageView ivFurnishing;
    private ImageView ivDecor;
    private ImageView ivLighting;
    private ImageView ivModular;
    private ImageView ivClearance, ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, ivOffer;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        ivFurniture = findViewById(R.id.ivFurniture);
        ivLiving = findViewById(R.id.ivLiving);
        ivBedroom = findViewById(R.id.ivBedRoom);
        ivKidsRoom = findViewById(R.id.ivKids);
        ivMattresses = findViewById(R.id.ivMattresses);
        ivFurnishing = findViewById(R.id.ivFurnishing);
        ivDecor = findViewById(R.id.ivDecor);
        ivLighting = findViewById(R.id.ivLighting);
        ivModular = findViewById(R.id.ivModularFurniture);
        ivClearance = findViewById(R.id.ivCleanserSale);
        ivHome = findViewById(R.id.ivHomeAlerts);
        ivDepartments = findViewById(R.id.ivDepartmentAlerts);
        ivAlerts = findViewById(R.id.ivAlertSofas);
        ivWishList = findViewById(R.id.ivHeartAlerts);
        ivProfiles = findViewById(R.id.ivSettingsSofas);
        ivOffer = findViewById(R.id.offer);

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(HomeScreen.this,AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(HomeScreen.this,DepartmentsActivity.class);
                startActivity(intent);
               finish();
            }
        });
        ivOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(HomeScreen.this,Furniture.class);
                startActivity(intent);
                finish();
            }
        });
        ivFurniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeScreen.this, Furniture.class);
                startActivity(intent);
                finish();
            }
        });
        ivLiving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeScreen.this, Living.class);
                startActivity(intent);
                finish();
            }
        });

        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeScreen.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
    }
}