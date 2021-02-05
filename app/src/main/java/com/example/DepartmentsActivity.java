package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class DepartmentsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBTNfurniture;
    private Button mBTNLiving;
    private Button mBTNBedRoom;
    private Button mBTNKidsRoom;
    private Button mBTNMattresses;
    private Button mBTNFurnishings;
    private Button mBTNDecor;
    private Button mBTNLightings;
    private Button mBTNModularFurniture;
    private Button mBTNClearanceSale;
    private Intent intent;
    private ImageView ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        initViews();

    }

    private void initViews() {
        mBTNfurniture = findViewById(R.id.btnfurniture);
        mBTNLiving = findViewById(R.id.btnLiving);
        mBTNBedRoom = findViewById(R.id.btnBedRoom);
        mBTNKidsRoom = findViewById(R.id.btnKidsRoom);
        mBTNMattresses = findViewById(R.id.btnMattresses);
        mBTNFurnishings = findViewById(R.id.btnFurnishings);
        mBTNDecor = findViewById(R.id.btnDecor);
        mBTNLightings = findViewById(R.id.btnLightings);
        mBTNModularFurniture = findViewById(R.id.btnModularFurniture);
        mBTNClearanceSale = findViewById(R.id.btnClearanceSale);

        mBTNfurniture.setOnClickListener(this);
        mBTNLiving.setOnClickListener(this);
        mBTNBedRoom.setOnClickListener(this);
        mBTNKidsRoom.setOnClickListener(this);
        mBTNMattresses.setOnClickListener(this);
        mBTNFurnishings.setOnClickListener(this);
        mBTNDecor.setOnClickListener(this);
        mBTNLightings.setOnClickListener(this);
        mBTNModularFurniture.setOnClickListener(this);
        mBTNClearanceSale.setOnClickListener(this);
        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        back = findViewById(R.id.tvMenu_Navigation);
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DepartmentsActivity.this, WishListFragment.class);
                startActivity(intent);
                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DepartmentsActivity.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DepartmentsActivity.this, AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DepartmentsActivity.this, DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });


        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DepartmentsActivity.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(DepartmentsActivity.this, Furniture.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnfurniture:
                Intent intent = new Intent(DepartmentsActivity.this, FurnitureExtended.class);
                startActivity(intent);
                break;
            case R.id.btnLiving:
                Intent living = new Intent(DepartmentsActivity.this, LivingExtended.class);
                startActivity(living);
                break;
            case R.id.btnBedRoom:
                Intent bedroom = new Intent(DepartmentsActivity.this, BedroomExtended.class);
                startActivity(bedroom);
                break;
            case R.id.btnKidsRoom:
                Intent kidsroom = new Intent(DepartmentsActivity.this, KidsRoomExtended.class);
                startActivity(kidsroom);
                break;
            case R.id.btnMattresses:
                Intent mattresses = new Intent(DepartmentsActivity.this, MattressesExtended.class);
                startActivity(mattresses);
                break;
            case R.id.btnFurnishings:
                Intent furnishings = new Intent(DepartmentsActivity.this, Furnishings.class);
                startActivity(furnishings);
                break;
            case R.id.btnDecor:
                Intent decor = new Intent(DepartmentsActivity.this, Decor.class);
                startActivity(decor);
                break;
            case R.id.btnLightings:
                Intent lightings = new Intent(DepartmentsActivity.this, Lighting.class);
                startActivity(lightings);
                break;
            case R.id.btnModularFurniture:
                Intent modularfurniture = new Intent(DepartmentsActivity.this, ModularFurniture.class);
                startActivity(modularfurniture);
                break;
            case R.id.btnClearanceSale:
                Intent clearancesale = new Intent(DepartmentsActivity.this, ClearanceSaleExtended.class);
                startActivity(clearancesale);
                break;
        }

    }
}

//mintu