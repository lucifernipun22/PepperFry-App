package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class ProfileExtendedChangePassword extends AppCompatActivity {
private EditText CurrentPassword;
private ImageView back;
private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_extended_change_password);
        initView();
        setPassword();
    }

    private void initView() {
        back=findViewById(R.id.imBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(ProfileExtendedChangePassword.this,ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void setPassword() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String Name = pref.getString(name.password, "454");
        CurrentPassword.setText(Name);
    }
}