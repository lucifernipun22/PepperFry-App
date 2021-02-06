package com.example;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.pepperfry.R;

public class BuyNowActivity extends AppCompatActivity {
    private ImageView IvBackToBuy, IvBuyNowItemImage;
    private EditText ETvDeliveryPin, ETvApplyCoupon;
    private Button BtnCheckDeliveryPin, BtnApplyCode, BtnPlaceOrder;
    private TextView TvItemBuyNowPrice, TvBuyNowItemName, TvBuyNowItemBrand, TvBuyNowItemWarranty, TvBuyNowItemSubPrice;
    private String Name, Price, Brand, Warranty, Image;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);
        InitViews();
        getDataFromIntent();
    }

    private void getDeliveryPinFromForm() {
        String DeliveryPin = ETvDeliveryPin.getText().toString();
        if (DeliveryPin.isEmpty()) {
            ETvDeliveryPin.setError("Delivery Pin Can't Be Empty");
        } else {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(BuyNowActivity.this);
            alertDialog.setTitle("Delivery Available At " + DeliveryPin)
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ShowToast("Delivery Pin Validated");
                        }
                    }).show();
        }
    }

    private void getApplyCodeFromForm() {
        String ApplyCode = ETvApplyCoupon.getText().toString();
        if (ApplyCode.isEmpty()) {
            ETvApplyCoupon.setError("ApplyCode Can't Be Empty");
        } else {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(BuyNowActivity.this);
            alertDialog.setTitle("Apply Code Is Valid")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ShowToast("Apply Code Validated");
                        }
                    }).show();
        }
    }

    private void InitViews() {
        IvBackToBuy = findViewById(R.id.IvBackToBuyNow);
        IvBuyNowItemImage = findViewById(R.id.IvBuyNowItemImage);
        ETvDeliveryPin = findViewById(R.id.ETvDeliveryPin);
        ETvApplyCoupon = findViewById(R.id.ETvApplyCoupon);
        BtnCheckDeliveryPin = findViewById(R.id.BtnCheckDeliveryPin);
        BtnPlaceOrder = findViewById(R.id.BtnPlaceOrder);
        BtnApplyCode = findViewById(R.id.BtnApplyCode);
        TvItemBuyNowPrice = findViewById(R.id.TvItemBuyNowPrice);
        TvBuyNowItemName = findViewById(R.id.TvBuyNowItemName);
        TvBuyNowItemBrand = findViewById(R.id.TvBuyNowItemBrand);
        TvBuyNowItemWarranty = findViewById(R.id.TvBuyNowItemWarranty);
        TvBuyNowItemSubPrice = findViewById(R.id.TvBuyNowItemSubPrice);
        IvBackToBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0 = new Intent(BuyNowActivity.this, BuyActivity.class);
                intent0.putExtra("Name", Name);
                intent0.putExtra("Price", Price);
                intent0.putExtra("Brand", Brand);
                intent0.putExtra("Warranty", Warranty);
                intent0.putExtra("Image", Image);
                startActivity(intent0);
            }
        });
        BtnCheckDeliveryPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDeliveryPinFromForm();
            }
        });
        BtnApplyCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getApplyCodeFromForm();
            }
        });
        BtnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(BuyNowActivity.this, PlaceOrderActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void getDataFromIntent() {
        if (getIntent() != null) {
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
            TvBuyNowItemSubPrice.setText("₹ " + Price);
        }
    }

    public void ShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}