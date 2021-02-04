package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pepperfry.R;

public class Furniture extends AppCompatActivity {
    private TextView sofas;
    private TextView seating;
    private TextView chairs;
    private TextView Tables;
    private TextView cabinetry;
    private TextView dining;
    private TextView beds;
    private ImageView sectionalSofas;
    private ImageView ShoesRack;
    private ImageView officeChairs;
    private ImageView storage;
    private ImageView DiningRoom;
    private ImageView BedRoom;
    private ImageView Leather;
    private ImageView ModernWriting;
    private ImageView DoorWardRobes;
    private ImageView DiningSetSix;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);
        itiViews();
    }

    private void itiViews() {
        sofas = findViewById(R.id.Sofas);
        seating = findViewById(R.id.Seating);
        chairs = findViewById(R.id.chairs);
        Tables = findViewById(R.id.Tables);
        cabinetry = findViewById(R.id.Carbinetry);
        dining = findViewById(R.id.Dining);
        beds = findViewById(R.id.Beds);
        sectionalSofas = findViewById(R.id.ivThreeSeater);
        ShoesRack = findViewById(R.id.ivFlowerLamp);
        officeChairs = findViewById(R.id.ivCoffeeTables);
        storage = findViewById(R.id.ivBestDetails);
        DiningRoom = findViewById(R.id.ivDiningRoom);
        BedRoom = findViewById(R.id.ivBedRoom);
        Leather = findViewById(R.id.ivLeatherTTE);
        ModernWriting = findViewById(R.id.iventertainmentunit);
        DoorWardRobes = findViewById(R.id.ivhangingLights);
        DiningSetSix = findViewById(R.id.ivWallArt);


    }
}