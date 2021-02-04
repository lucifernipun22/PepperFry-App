package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SofasActivity extends AppCompatActivity implements ItemClickListener {
    private ImageView mIVLeftArrow, mIvSettings, mIvHeart, mIvAlert, mIvDepartment, mIvHome;
    private RecyclerView SofasRecyclerView;
    private List<AllSofas> sofasList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sofas);
        initViews();
        BuildSofasData();
        setAllSofasToRecycler();
    }

    private void initViews() {
        mIVLeftArrow = findViewById(R.id.ivLeftArrowSofas);
        mIvSettings = findViewById(R.id.ivSettingsSofas);
        mIvHeart = findViewById(R.id.ivHeartAlerts);
        mIvAlert = findViewById(R.id.ivAlertSofas);
        mIvDepartment = findViewById(R.id.ivDepartmentAlerts);
        mIvHome = findViewById(R.id.ivHomeAlerts);
        SofasRecyclerView = findViewById(R.id.RvAllSofas);
        mIVLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SofasActivity.this, Furniture.class);
                startActivity(intent);
            }
        });
    }

    private void BuildSofasData() {
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                sofasList.add(new AllSofas("Hugo 1 Seater Sofa in Garnet Red Colour", "21,999", "Woodsworth",
                        "H 33 x W 37 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "30 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Hugo", "16", "FM1745643-S-WH32456", "" +
                        "https://ii2.pepperfry.com/media/catalog/product/h/u/236x260/hugo-1-seater-sofa-in-garnet-red-colour-by-woodsworth-hugo-1-seater-sofa-in-garnet-red-colour-by-woo-mwxgil.jpg"));
            } else if (i % 10 == 1) {
                sofasList.add(new AllSofas("Hugo 1 Seater Sofa in Navy Blue Colour", "21,999", "Woodsworth",
                        "H 33 x W 37 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "30 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Hugo", "16", "FM1745643-S-WH32456", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/h/u/568x625/hugo-one-seater-sofa-in-navy-blue-colour-by-woodsworth-hugo-one-seater-sofa-in-navy-blue-colour-by-w-togn3l.jpg"));
            } else if (i % 10 == 2) {
                sofasList.add(new AllSofas("Miranda 1 Seater Sofa in Beige Colour", "19,499", "Woodsworth",
                        "H 35.5 x W 38 x D 35.5; Seating Height-18; Seating Depth - 22.5 (all dimensions in inches)",
                        "31 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Miranda", "18", "FM1745609-S-WH32517", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/m/i/568x625/miranda-1-seater-sofa-in-beige-colour-by-woodsworth-miranda-1-seater-sofa-in-beige-colour-by-woodswo-bk637b.jpg"));
            } else if (i % 10 == 3) {
                sofasList.add(new AllSofas("Diego 1 Seater Sofa in Garnet Red Colour", "25,999", "Woodsworth",
                        "H 40 x W 34 x D 37; Seating Height-18 ; Seating Depth : 21 (all dimensions in inches)",
                        "34.65 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Diego", "16", "FM1745643-S-WH32489", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/d/i/568x625/diego-1-seater-sofa-in-garnet-red-colour-by-woodsworth-diego-1-seater-sofa-in-garnet-red-colour-by-w-vv6wm6.jpg"));
            } else if (i % 10 == 4) {
                sofasList.add(new AllSofas("Miranda 2 Seater Sofa in Charcoal Grey Colour", "29,999", "Woodsworth",
                        "H 33 x W 37 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "43 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Miranda", "18", "FM1745643-S-WH32456", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/m/i/568x284/miranda-2-seater-sofa-in-charcoal-grey-colour-by-woodsworth-miranda-2-seater-sofa-in-charcoal-grey-c-phliek.jpg"));
            } else if (i % 10 == 5) {
                sofasList.add(new AllSofas("Diego 2 Seater Sofa in Sandy Brown Colour", "38,999", "Woodsworth",
                        "H 40 x W 60 x D 37; Seating Height-18 ; Seating Depth : 21 (all dimensions in inches)",
                        "51.3 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Diego", "18", "FM1745612-S-WH32517", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/d/i/568x284/diego-2-seater-sofa-in-sandy-brown-colour-by-woodsworth-diego-2-seater-sofa-in-sandy-brown-colour-by-dfp77a.jpg"));
            } else if (i % 10 == 6) {
                sofasList.add(new AllSofas("Hugo 2 Seater Sofa in Denim Blue Colour", "30,999", "Woodsworth",
                        "H 33 x W 61 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "41 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Hugo", "16", "FM1745643-S-WH32456", "" +
                        "https://ii2.pepperfry.com/media/catalog/product/h/u/236x260/hugo-1-seater-sofa-in-garnet-red-colour-by-woodsworth-hugo-1-seater-sofa-in-garnet-red-colour-by-woo-mwxgil.jpg"));
            } else if (i % 10 == 7) {
                sofasList.add(new AllSofas("Hugo 2 Seater Sofa in Chestnut Brown Colour", "30,999", "Woodsworth",
                        "H 33 x W 37 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "41 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Hugo", "16", "FM1745643-S-WH32456", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/h/u/568x284/hugo-2-seater-sofa-in-chestnut-brown-colour-by-woodsworth-hugo-2-seater-sofa-in-chestnut-brown-colou-rvr43t.jpg"));
            } else if (i % 10 == 8) {
                sofasList.add(new AllSofas("Hugo 3 Seater Sofa in Garnet Red Colour", "40,999", "Woodsworth",
                        "H 33 x W 85 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "52 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Hugo", "16", "FM1745675-S-WH32456", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/h/u/568x284/hugo-3-seater-sofa-in-garnet-red-colour-by-woodsworth-hugo-3-seater-sofa-in-garnet-red-colour-by-woo-w6fg6e.jpg"));
            } else if (i % 10 == 9) {
                sofasList.add(new AllSofas("Hugo 1 Seater Sofa in Garnet brown Colour", "21,999", "Woodsworth",
                        "H 33 x W 37 x D 35; Seating Height-16; Seating Depth : 21.5 (all dimensions in inches)",
                        "30 KG", "36 Months' Warranty", "Carpenter Assembly", "Fabric",
                        "Living Room", "Hugo", "16", "FM1745643-S-WH32456", "" +
                        "https://ii1.pepperfry.com/media/catalog/product/h/u/568x284/hugo-three-seater-sofa-in-sandy-brown-colour-by-woodsworth-hugo-three-seater-sofa-in-sandy-brown-col-tugfju.jpg"));
            }
        }
    }

    private void setAllSofasToRecycler() {
        /* GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        SofasRecyclerView.setLayoutManager(linearLayoutManager);

        AllSofasAdapters allSofasAdapters = new AllSofasAdapters(sofasList, this);
        SofasRecyclerView.setAdapter(allSofasAdapters);
    }

    @Override
    public void onSofasClicked(AllSofas sofas) {
        ShowToast(sofas.getBrand());
    }

    public void ShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}