package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*import com.example.pepperfry.R;*/

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



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
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
                Intent furnishings = new Intent(DepartmentsActivity.this, FurnishingsExtended.class);
                startActivity(furnishings);
                break;
            case R.id.btnDecor:
                Intent decor = new Intent(DepartmentsActivity.this, DecorExtended.class);
                startActivity(decor);
                break;
            case R.id.btnLightings:
                Intent lightings = new Intent(DepartmentsActivity.this, LightingExtended.class);
                startActivity(lightings);
                break;
            case R.id.btnModularFurniture:
                Intent modularfurniture = new Intent(DepartmentsActivity.this, ModularFurnitureExtended.class);
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