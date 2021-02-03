package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pepperfry.R;

public class LoginOrRegister extends AppCompatActivity {
private Button mBTNLogin;
private Button mBTNRegister;
private Button mBTNSkipItKnow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);
        mBTNLogin = findViewById(R.id.btnLogin);
        mBTNRegister = findViewById(R.id.btnRegister);
        mBTNSkipItKnow = findViewById(R.id.btnSkipItNow);
        mBTNRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginOrRegister.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        mBTNSkipItKnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(LoginOrRegister.this, HomeScreen.class);
                startActivity(intent2);
            }
        });

    }
}