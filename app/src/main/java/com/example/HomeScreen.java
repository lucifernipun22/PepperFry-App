package com.example;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Notification;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class HomeScreen extends AppCompatActivity {
    private ImageView ivFurniture;
    private ImageView ivLiving;
    private ImageView menuNavigation;
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
        menuNavigation=findViewById(R.id.tvMenu_Navigation);
        ivModular = findViewById(R.id.ivModularFurniture);
        ivClearance = findViewById(R.id.ivCleanserSale);
        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        ivOffer = findViewById(R.id.offer);

        ivBedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, Bedroom.class);
                startActivity(intent);
//                finish();
            }
        });
        ivKidsRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, KidsRoom.class);
                startActivity(intent);
//                finish();
            }
        });
        ivMattresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, Mattresses.class);
                startActivity(intent);
//                finish();
            }
        });
        ivFurnishing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, Furnishings.class);
                startActivity(intent);
//                finish();
            }
        });
        ivDecor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, Decor.class);
                startActivity(intent);
//                finish();
            }
        });
        ivLighting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, Lighting.class);
                startActivity(intent);
//                finish();
            }
        });
        ivModular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, ModularFurniture.class);
                startActivity(intent);
//                finish();
            }
        });
        menuNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(HomeScreen.this, NavigationActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(HomeScreen.this,WhishList.class);
                startActivity(intent);
//                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(HomeScreen.this,HomeScreen.class);
                startActivity(intent);
//                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(HomeScreen.this,AlertsActivity.class);
                startActivity(intent);
//               finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(HomeScreen.this,DepartmentsActivity.class);
                startActivity(intent);
//              finish();
            }
        });



        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeScreen.this, ProfileSection.class);
                startActivity(intent);
//               finish();
            }
        });
        ivFurniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeScreen.this, Furniture.class);
                startActivity(intent);
//                finish();
            }
        });
        ivLiving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(HomeScreen.this, Living.class);
                startActivity(intent);
//               finish();
            }
        });
        ivOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(HomeScreen.this,Furniture.class);
                startActivity(intent);
//               finish();
            }
        });
    }


}