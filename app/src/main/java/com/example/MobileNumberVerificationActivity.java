package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.broooapps.otpedittext2.OnCompleteListener;
import com.broooapps.otpedittext2.OtpEditText;
import com.example.pepperfry.R;

public class MobileNumberVerificationActivity extends AppCompatActivity {
    private ImageView mIvBackToRegistration, mIvShopCart, mIvSearchBar;
    private TextView mTvMobileVerification, mTvWaiting_otp,
            mTvMobileNumber, mTvOtpValidate, mTvOtpNotReceive, mTvOtpResend;
    private Button btnConfirm;
    private OtpEditText otpEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number_verification);
        initViews();
        setPhoneNumber();
    }

    private void initViews() {
        mIvBackToRegistration = findViewById(R.id.ivbackToRegistration);
        mIvSearchBar = findViewById(R.id.ivSearchBar);
        mIvShopCart = findViewById(R.id.ivShopCart);
        mTvMobileVerification = findViewById(R.id.tvMobileVerification);
        mTvWaiting_otp = findViewById(R.id.tvwaiting_otp);
        mTvMobileNumber = findViewById(R.id.tvMobileNumber);
        mTvOtpValidate = findViewById(R.id.tvOtpValidate);
        mTvOtpNotReceive = findViewById(R.id.tvOtpnotReceive);
        mTvOtpResend = findViewById(R.id.tvOtpResend);
        otpEditText = findViewById(R.id.etOtp);
        btnConfirm =findViewById(R.id.buttonConfirm);
        mIvBackToRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileNumberVerificationActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    setListeners();

    }

    private void setPhoneNumber() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String phoneNumber = pref.getString(name.phoneNumber, "454");
        mTvMobileNumber.setText(phoneNumber);
    }
    boolean isButtonEnabled2 = false;

    private void setListeners() {
        otpEditText.setOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(String value) {
                activityTriversalWithAnimation(StartShoppingActivity.class);
            }
        });
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isButtonEnabled2) {
                    activityTriversalWithAnimation(StartShoppingActivity.class);
                }
            }
        });

    }
    private void activityTriversalWithAnimation(Class classname) {
        Intent intent = new Intent(MobileNumberVerificationActivity.this, classname);
        startActivity(intent);
    }


}