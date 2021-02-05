package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class ProfileExtendedMyWallet extends AppCompatActivity {
    private ImageView back;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_extended_my_wallet);
        initView();
    }

    private void initView() {
        back = findViewById(R.id.imBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileExtendedMyWallet.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
    }
}