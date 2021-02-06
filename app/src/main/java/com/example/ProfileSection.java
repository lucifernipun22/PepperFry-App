package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pepperfry.R;

public class ProfileSection extends AppCompatActivity {
    private Button mBTNMyOrder;
    private Button mBTNTrackOrder;
    private Button mBTNWhishList;
    private Button mBTNAddressBook;
    private Button mBTNChangePassword;
    private TextView mBTNEditButton;
    private TextView mBTNMyWallet;


    private Intent intent;
    private ImageView ivHome, ivDepartments, ivAlerts, ivWishList, ivProfiles, back;
    private TextView NameEdit, EmailEdit, EditButton, SignOut, NumberEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_section);
        initViews();
        setName();
        setNumber();
        setEmail();

    }

    public void initViews() {
        mBTNMyOrder = findViewById(R.id.btnMyOrder);
        mBTNTrackOrder = findViewById(R.id.btnTrackOrder);
        mBTNWhishList = findViewById(R.id.btnWhishList);
        mBTNAddressBook = findViewById(R.id.btnAddressBook);
        mBTNChangePassword = findViewById(R.id.btnChangePassword);
        mBTNEditButton = findViewById(R.id.EditButton);
        mBTNMyWallet = findViewById(R.id.btnMyWallet);
        ivHome = findViewById(R.id.ivHome);
        ivDepartments = findViewById(R.id.ivDepartment);
        ivAlerts = findViewById(R.id.ivAlert);
        ivWishList = findViewById(R.id.ivHeart);
        ivProfiles = findViewById(R.id.ivSettings);
        back = findViewById(R.id.imBack);
        NameEdit = findViewById(R.id.NameEdit);
        NumberEdit = findViewById(R.id.NumberEdit);
        EmailEdit = findViewById(R.id.EmailEdit);
        SignOut = findViewById(R.id.SignOut);


        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, SignOutConfirm.class);
                startActivity(intent);
//                finish();

            }
        });
        ivWishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, WhishList.class);
                startActivity(intent);
//                finish();
            }
        });
        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, HomeScreen.class);
                startActivity(intent);
//                finish();
            }
        });

        ivAlerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, AlertsActivity.class);
                startActivity(intent);
//                finish();
            }
        });
        ivDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, DepartmentsActivity.class);
                startActivity(intent);
//                finish();
            }
        });


        ivProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, ProfileSection.class);
                startActivity(intent);
//                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, Furniture.class);
                startActivity(intent);
//                finish();
            }
        });

        mBTNMyOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, ProfileExtendedMyOrder.class);
                startActivity(intent);
            }
        });
        mBTNTrackOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 intent = new Intent(ProfileSection.this, ProfileExtendedTrackOrder.class);
                startActivity(intent);
            }
        });
        mBTNWhishList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, WhishList.class);
                startActivity(intent);
            }
        });
        mBTNAddressBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, ProfileExtendedAddressBook.class);
                startActivity(intent);
            }
        });
        mBTNChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, ProfileExtendedChangePassword.class);
                startActivity(intent);
            }
        });
        mBTNEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, ProfileExtendedEditButton.class);
                startActivity(intent);
            }
        });
        mBTNMyWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ProfileSection.this, ProfileExtendedMyWallet.class);
                startActivity(intent);
            }
        });

    }


    private void setName() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String Name = pref.getString(name.Name, "");
        NameEdit.setText(Name);
    }

    private void setNumber() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String phoneNumber = pref.getString(name.phoneNumber, "");
        NumberEdit.setText(phoneNumber);
    }

    private void setEmail() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String email = pref.getString(name.email, "");
        EmailEdit.setText(email);
    }

}
