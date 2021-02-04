package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.pepperfry.R;

import java.util.ArrayList;
import java.util.List;

public class SectionalSofas extends AppCompatActivity {
    private ImageView back;
    private ImageView like;
    private ImageView cart;
    private Intent intent;
    private RecyclerView mRecyclerView;
    private List<SectionalModel> sectionalModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sectional_sofas);
        mRecyclerView = findViewById(R.id.recyclerView);
        buildData();
        setRecyclerData();


        back = findViewById(R.id.tvLeftArrow);

        
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SectionalSofas.this, Furniture.class);
                startActivity(intent);
                finish();
                initViews();
            }


        });

    }
    private void initViews() {
        like=findViewById(R.id.Like);
        cart=findViewById(R.id.cart);

    }


    private void setRecyclerData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        SectionalAdapter adapter = new SectionalAdapter(sectionalModels);
        mRecyclerView.setAdapter(adapter);
    }

    private void buildData() {
        sectionalModels = new ArrayList<>();
        sectionalModels.add(new SectionalModel(R.drawable.sofa1, "Hugo LHS 3 Seater Sofa with Lounger", "WoodsWorth by PepperFry", "₹ 66,999", "Save ₹ 47,000(41% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa2, "Alba LHS 3 Seater Sofa With Lounger", "WoodsWorth by PepperFry", "₹ 50,999", "Save ₹ 40,000(44% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa3, "Miranda LHS 2 Seater Sofa With Lounger", "WoodsWorth by PepperFry", "₹ 48,999", "Save ₹ 39,000(44% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa4, "Santiago LHS 3 Seater Sofa With Lounger", "WoodsWorth by PepperFry", "₹ 54,999", "Save ₹ 32,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa5, "Santiago 3 Seater LHS Sectional Sofa", "CaseCraft by PepperFry", "₹ 54,999", "Save ₹ 32,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa6, "Santiago 3 Seater RHS Sectional Sofa ", "CaseCraft by PepperFry", "₹ 73,999", "Save ₹ 37,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa7, "Alba RHS 3 Seater Sofa With Lounger", "WoodsWorth by PepperFry", "₹ 50,999", "Save ₹ 40,000(44% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa8, "Douglas LHS 3 Seater Sofa With Lounger", "By Muebles Casa", "₹ 76,999", "Save ₹ 1,98,000(72% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa9, "Hugo RHS 3 Seater Sofa With Lounger", "WoodsWorth by PepperFry", "₹ 66,999", "Save ₹ 46,000(41% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.sofa10, "Andres LHS 3 Seater Sofa With Lounger", "WoodsWorth by PepperFry", "₹ 58,999", "Save ₹ 34,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));

    }
}