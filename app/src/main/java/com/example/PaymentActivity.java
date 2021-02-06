package com.example;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pepperfry.R;

public class PaymentActivity extends AppCompatActivity {
    private Button BtnPayOnDelivery;
    private String FullName, MobileNo, PinCode, Address, City,State;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        BtnPayOnDelivery = findViewById(R.id.BtnPayOnDelivery);
        getDataFromIntent();
        Listeners();
    }

    private void Listeners() {
        BtnPayOnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(PaymentActivity.this);
                alertDialog.setTitle("Order Shipping Address Details")
                        .setMessage(" Order Deliver In 7 Working Days\n Name : " + FullName + "\n Mobile No : " + MobileNo + "\n Pin Code : " + PinCode + "\n City : " + City)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(PaymentActivity.this, HomeScreen.class);
                                startActivity(intent);
                            }
                        }).show();
            }
        });
    }

    private void getDataFromIntent() {
        if (getIntent() != null) {
            FullName = getIntent().getStringExtra("FullName");
            MobileNo = getIntent().getStringExtra("MobileNo");
            PinCode = getIntent().getStringExtra("PinCode");
            Address = getIntent().getStringExtra("Address");
            City = getIntent().getStringExtra("City");
            State = getIntent().getStringExtra("State");
        }
    }
}