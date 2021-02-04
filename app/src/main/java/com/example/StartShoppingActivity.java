package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartShoppingActivity extends AppCompatActivity {
private Button mBtnStartShopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_shopping);
        initViews();
    }

    private void initViews() {
        mBtnStartShopping =findViewById(R.id.BtnStartShoping);
        mBtnStartShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(StartShoppingActivity.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

    }
}