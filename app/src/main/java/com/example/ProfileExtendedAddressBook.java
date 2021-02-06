package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class ProfileExtendedAddressBook extends AppCompatActivity {
    private Button mBtnStartShopping;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_extended_whish_list);
        initViews();

    }

    private void initViews() {
        mBtnStartShopping =findViewById(R.id.BtnStartShoping);
        back=findViewById(R.id.imBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ProfileExtendedAddressBook.this,ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
        mBtnStartShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ProfileExtendedAddressBook.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

    }
}