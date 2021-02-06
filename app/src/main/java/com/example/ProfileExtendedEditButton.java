package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class ProfileExtendedEditButton extends AppCompatActivity {
    private Intent intent;
    private ImageView  back;
    private EditText Name, Email, Number;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_extended_edit_button);
        initViews();
        setName();
        setNumber();
        setEmail();

    }

    public void initViews() {
        back = findViewById(R.id.imBack);
        Name=findViewById(R.id.name);
        Email=findViewById(R.id.email);
        Number=findViewById(R.id.number);
        save=findViewById(R.id.Button);
       save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileExtendedEditButton.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileExtendedEditButton.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void setName() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String Nameed = pref.getString(name.Name, "454");
        Name.setText(Nameed);
    }

    private void setNumber() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String phoneNumber = pref.getString(name.phoneNumber, "454");
        Number.setText(phoneNumber);
    }

    private void setEmail() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String email = pref.getString(name.email, "454");
        Email.setText(email);
    }
}