package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class HomeScreen extends AppCompatActivity {
    private ImageView mIVivDepartment;
    private ImageView mIVivAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        mIVivDepartment = findViewById(R.id.ivDepartment);
        mIVivAlert = findViewById(R.id.ivAlert);
        mIVivDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HomeScreen.this, DepartmentsActivity.class);
                startActivity(intent3);
            }
        });
        mIVivAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(HomeScreen.this, AlertsActivity.class);
                startActivity(intent4);
            }
        });


    }
}