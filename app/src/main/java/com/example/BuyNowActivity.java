package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.pepperfry.R;

public class BuyNowActivity extends AppCompatActivity {
private ImageView IvBackToBuy,IvBuyNowItemImage;
private EditText ETvDeliveryPin,ETvApplyCoupon;
private Button BtnCheckDeliveryPin,BtnApplyCode;
private TextView TvItemBuyNowPrice,TvBuyNowItemName,TvBuyNowItemBrand,TvBuyNowItemWarranty,TvBuyNowItemSubPrice;
private  String Name,Price,Brand,Warranty,Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);
        InitViews();
        getDataFromIntent();
    }

    private void InitViews() {
        IvBackToBuy = findViewById(R.id.IvBackToBuy);
        IvBuyNowItemImage = findViewById(R.id.IvBuyNowItemImage);
        ETvDeliveryPin = findViewById(R.id.ETvDeliveryPin);
        ETvApplyCoupon = findViewById(R.id.ETvApplyCoupon);
        BtnCheckDeliveryPin = findViewById(R.id.BtnCheckDeliveryPin);
        BtnApplyCode = findViewById(R.id.BtnApplyCode);
        TvItemBuyNowPrice = findViewById(R.id.TvItemBuyNowPrice);
        TvBuyNowItemName = findViewById(R.id.TvBuyNowItemName);
        TvBuyNowItemBrand = findViewById(R.id.TvBuyNowItemBrand);
        TvBuyNowItemWarranty = findViewById(R.id.TvBuyNowItemWarranty);
        TvBuyNowItemSubPrice = findViewById(R.id.TvBuyNowItemSubPrice);
        IvBackToBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0 = new Intent(BuyNowActivity.this,BuyActivity.class);
                intent0.putExtra("Name",Name);
                intent0.putExtra("Price",Price);
                intent0.putExtra("Brand",Brand);
                intent0.putExtra("Warranty",Warranty);
                intent0.putExtra("Image",Image);
                startActivity(intent0);
            }
        });
    }

    private void getDataFromIntent() {
        if (getIntent() != null){
            Name = getIntent().getStringExtra("Name");
            Price = getIntent().getStringExtra("Price");
             Brand = getIntent().getStringExtra("Brand");
             Warranty = getIntent().getStringExtra("Warranty");
             Image = getIntent().getStringExtra("Image");
            Glide.with(IvBuyNowItemImage).load(Image).into(IvBuyNowItemImage);
            TvItemBuyNowPrice.setText(Price);
            TvBuyNowItemName.setText(Name);
            TvBuyNowItemBrand.setText(Brand);
            TvBuyNowItemWarranty.setText(Warranty);
            TvBuyNowItemSubPrice.setText("₹ "+Price);
        }
    }
}