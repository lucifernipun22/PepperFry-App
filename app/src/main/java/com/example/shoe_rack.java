package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.pepperfry.R;

import java.util.ArrayList;
import java.util.List;

public class shoe_rack extends AppCompatActivity {
    private ImageView back;
    private ImageView like;
    private ImageView cart;
    private Intent intent;
    private RecyclerView mRecyclerView;
    private List<SectionalModel> sectionalModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_rack);
        mRecyclerView = findViewById(R.id.recyclerView);
        buildData();
        setRecyclerData();


        back = findViewById(R.id.tvLeftArrow);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(shoe_rack.this, Furniture.class);
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
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        SectionalAdapter adapter = new SectionalAdapter(sectionalModels);
        mRecyclerView.setAdapter(adapter);
    }

    private void buildData() {
        sectionalModels = new ArrayList<>();
        sectionalModels.add(new SectionalModel(R.drawable.rack1, "Juror Shoe Cabinet", "MintWud by PepperFry", "₹ 4,499", "Save ₹ 6,498(58% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack2, "Stigen Solid Wood Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 24,999", "Save ₹ 23,000(48% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack3, "kiki Shoe Rack", "MintWud By PepperFry", "₹ 4,499", "Save ₹ 5,498(55% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack4, "Sayuri Shoe Cabinet", "MintWud By PepperFry", "₹ 4,499", "Save ₹ 4,000(47% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack5, "Haze Shoe Cabinet", "By WoodCrony", "₹ 83,499", "Save ₹ 41500(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack6, "Kiki Shoe Cabinet ", "CaseCraft by PepperFry", "₹ 2999", "Save ₹ 4000(47% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack7, "Alba Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 5,999", "Save ₹ 4,000(44% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack8, "Douglas Shoe Cabinet", "By Muebles Casa", "₹ 6,999", "Save ₹ 1,8,000(72% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack9, "Hugo Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 6,999", "Save ₹ 4,000(41% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack10, "Andres Solid Wood Rack", "WoodsWorth by PepperFry", "₹ 5,999", "Save ₹ 3,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack1, "Juror Shoe Cabinet", "MintWud by PepperFry", "₹ 4,499", "Save ₹ 6,498(58% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack2, "Stigen Solid Wood Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 24,999", "Save ₹ 23,000(48% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack3, "kiki Shoe Rack", "MintWud By PepperFry", "₹ 4,499", "Save ₹ 5,498(55% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack4, "Sayuri Shoe Cabinet", "MintWud By PepperFry", "₹ 4,499", "Save ₹ 4,000(47% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack5, "Haze Shoe Cabinet", "By WoodCrony", "₹ 83,499", "Save ₹ 41500(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack6, "Kiki Shoe Cabinet ", "CaseCraft by PepperFry", "₹ 2999", "Save ₹ 4000(47% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack7, "Alba Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 5,999", "Save ₹ 4,000(44% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack8, "Douglas Shoe Cabinet", "By Muebles Casa", "₹ 6,999", "Save ₹ 1,8,000(72% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack9, "Hugo Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 6,999", "Save ₹ 4,000(41% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack10, "Andres Solid Wood Rack", "WoodsWorth by PepperFry", "₹ 5,999", "Save ₹ 3,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack6, "Kiki Shoe Cabinet ", "CaseCraft by PepperFry", "₹ 2999", "Save ₹ 4000(47% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack7, "Alba Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 5,999", "Save ₹ 4,000(44% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack8, "Douglas Shoe Cabinet", "By Muebles Casa", "₹ 6,999", "Save ₹ 1,8,000(72% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack9, "Hugo Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 6,999", "Save ₹ 4,000(41% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack10, "Andres Solid Wood Rack", "WoodsWorth by PepperFry", "₹ 5,999", "Save ₹ 3,000(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack1, "Juror Shoe Cabinet", "MintWud by PepperFry", "₹ 4,499", "Save ₹ 6,498(58% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack2, "Stigen Solid Wood Shoe Cabinet", "WoodsWorth by PepperFry", "₹ 24,999", "Save ₹ 23,000(48% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack3, "kiki Shoe Rack", "MintWud By PepperFry", "₹ 4,499", "Save ₹ 5,498(55% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack4, "Sayuri Shoe Cabinet", "MintWud By PepperFry", "₹ 4,499", "Save ₹ 4,000(47% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
        sectionalModels.add(new SectionalModel(R.drawable.rack5, "Haze Shoe Cabinet", "By WoodCrony", "₹ 83,499", "Save ₹ 41500(37% Off)", "CashBack Worth ₹ 15,000", "Limited Time Offer", "Ship in 1 Day"));
    }
}