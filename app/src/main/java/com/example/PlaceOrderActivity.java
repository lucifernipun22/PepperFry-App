package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class PlaceOrderActivity extends AppCompatActivity {
    private EditText EtvFullNameOrder, EtvMobileOrder, EtvPincodeOrder, EtvAdrOrder, EtvCityOrder, EtvStateOrder;
    private Button BtnConfirmedOrder;
    private ImageView IvBackToBuyNow;
    private Intent intent;
    private String FullName, MobileNo, PinCode, Address, City, State;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);
        initViewsAndListeners();
    }

    private void initViewsAndListeners() {
        EtvFullNameOrder = findViewById(R.id.EtvFullNameOrder);
        EtvMobileOrder = findViewById(R.id.EtvMobileOrder);
        EtvPincodeOrder = findViewById(R.id.EtvPincodeOrder);
        EtvAdrOrder = findViewById(R.id.EtvAdrOrder);
        EtvCityOrder = findViewById(R.id.EtvCityOrder);
        EtvStateOrder = findViewById(R.id.EtvStateOrder);
        BtnConfirmedOrder = findViewById(R.id.BtnConfirmedOrder);
        IvBackToBuyNow = findViewById(R.id.IvBackToBuyNow);
        BtnConfirmedOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (IsDataValidate()) {
                    intent = new Intent(PlaceOrderActivity.this, PaymentActivity.class);
                    intent.putExtra("FullName", FullName);
                    intent.putExtra("MobileNo", MobileNo);
                    intent.putExtra("PinCode", PinCode);
                    intent.putExtra("Address", Address);
                    intent.putExtra("City", City);
                    intent.putExtra("State", State);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean IsDataValidate() {
        FullName = EtvFullNameOrder.getText().toString();
        MobileNo = EtvMobileOrder.getText().toString();
        PinCode = EtvPincodeOrder.getText().toString();
        Address = EtvAdrOrder.getText().toString();
        City = EtvCityOrder.getText().toString();
        State = EtvStateOrder.getText().toString();
        if (FullName.isEmpty()) {
            EtvFullNameOrder.setError("Full Name Can't Be Empty");
            return false;
        } else if (MobileNo.isEmpty()) {
            EtvMobileOrder.setError("Mobile No Can't Be Empty");
            return false;
        } else if (PinCode.isEmpty()) {
            EtvPincodeOrder.setError("Pin Code Can't Be Empty");
            return false;
        } else if (Address.isEmpty()) {
            EtvAdrOrder.setError("Address Can't Be Empty");
            return false;
        } else if (City.isEmpty()) {
            EtvCityOrder.setError("City Can't Be Empty");
            return false;
        } else if (State.isEmpty()) {
            EtvStateOrder.setError("State Can't Be Empty");
            return false;
        }
        return true;
    }
}