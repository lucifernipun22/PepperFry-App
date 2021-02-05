package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class Decor extends AppCompatActivity {
    private ImageView back;
    private Intent intent;
    private ImageView  ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decor);
        back=findViewById(R.id.tvLeftArrow);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(Decor.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        back=findViewById(R.id.tvLeftArrow);
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(Decor.this,WhishList.class);
                startActivity(intent);
                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(Decor.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(Decor.this,AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(Decor.this,DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });



        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Decor.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
    }
}