package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pepperfry.R;

import java.util.ArrayList;
import java.util.List;

public class SeatingActivity extends AppCompatActivity implements ItemClickListener {
    private ImageView mIVLeftArrow, mIvSettings, mIvHeart, mIvAlert, mIvDepartment, mIvHome;
    private RecyclerView SetsRecyclerView;
    private Intent intent;
    private List<AllSeats> allSeatsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seating);
        initViews();
        BuildSeatasData();
        setAllSeatsToRecycler();
    }

    private void initViews() {
        mIVLeftArrow = findViewById(R.id.ivLeftArrowSofas);
        mIvSettings = findViewById(R.id.ivSettings);
        mIvHeart = findViewById(R.id.ivHeart);
        mIvAlert = findViewById(R.id.ivAlert);
        mIvDepartment = findViewById(R.id.ivDepartment);
        mIvHome = findViewById(R.id.ivHome);
        SetsRecyclerView = findViewById(R.id.RvAllSofas);
        mIVLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, Furniture.class);
                startActivity(intent);
            }
        });
        mIvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
        mIvHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(SeatingActivity.this,WhishList.class);
                startActivity(intent);
                finish();
            }
        });
        mIvAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(SeatingActivity.this,AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        mIvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(SeatingActivity.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
        mIvDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(SeatingActivity.this,DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void BuildSeatasData() {
        for (int i = 0; i < 50; i++){

                allSeatsList.add(new AllSeats("Freddie Settee in Teak Wood Finish","34,099","Make Home Happy",
                        "H 33 x W 50 x D 20; Seating Height : 17(all dimensions are in inches)","15 KG","12 Months' Warranty",
                        "No Assembly Required","Teak Wood","Living Room","17","FN1788167-S-PM31835",
                        "https://ii1.pepperfry.com/media/catalog/product/f/r/568x625/freddie-settee-in-teak-wood-finish-by-make-home-happy-freddie-settee-in-teak-wood-finish-by-make-hom-lnlz3n.jpg"));

        }
    }

    private void setAllSeatsToRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
       SetsRecyclerView.setLayoutManager(linearLayoutManager);
      AllSeatsAdapters allSeatsAdapters = new AllSeatsAdapters(allSeatsList,this);
      SetsRecyclerView.setAdapter(allSeatsAdapters);
    }

    @Override
    public void onSeatsClicked(AllSeats seats) {

    }

    @Override
    public void onSofasClicked(AllSofas sofas) {
     // This Fun For Sofas
    }

    public void ShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}