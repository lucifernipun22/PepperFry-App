package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pepperfry.R;

public class SignOutConfirm extends AppCompatActivity {
private Intent intent;
private Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_out_confirm);
        deleteData();
        confirm=findViewById(R.id.Confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteData();
            }
        });
    }
    private void deleteData() {
        sharedPrefNames name = new sharedPrefNames();
        getApplicationContext().getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE).edit().clear().apply();
        intent = new Intent(SignOutConfirm.this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }
}