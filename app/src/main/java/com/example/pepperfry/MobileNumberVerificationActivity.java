package com.example.pepperfry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileNumberVerificationActivity extends AppCompatActivity {
    private ImageView mIvBackToRegistration, mIvShopCart, mIvSearchBar;
    private TextView mTvMobileVerification, mTvWaiting_otp,
            mTvMobileNumber, mTvOtpValidate, mTvOtpNotReceive, mTvOtpResend;
    private EditText mEtvFirst, mEtvSecond, mEtvThird, mEtvFourth, mEtvFifth, mEtvSixth;
    private GridLayout mGirdRow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number_verification);
        initViews();
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
        mGirdRow = findViewById(R.id.gridRow);
        mEtvFirst = findViewById(R.id.EtvFirstDigit);
        mEtvSecond = findViewById(R.id.EtvSecondDigit);
        mEtvThird = findViewById(R.id.EtvThirdDigit);
        mEtvFourth = findViewById(R.id.EtvFourthDigit);
        mEtvFifth = findViewById(R.id.EtvFifthDigit);
        mEtvSixth = findViewById(R.id.EtvSixthDigit);
    }
}