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

/*import com.example.pepperfry.R;*/

public class MobileNumberVerificationActivity extends AppCompatActivity {
    private ImageView mIvBackToRegistration, mIvShopCart, mIvSearchBar;
    private TextView mTvMobileVerification, mTvWaiting_otp,
            mTvMobileNumber, mTvOtpValidate, mTvOtpNotReceive, mTvOtpResend;
    private EditText mEtvFirst, mEtvSecond, mEtvThird, mEtvFourth, mEtvFifth, mEtvSixth;
    private GridLayout mGirdRow;
    private Button btnConfirm;

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
        mGirdRow = findViewById(R.id.gridRow);
        mEtvFirst = findViewById(R.id.EtvFirstDigit);
        mEtvSecond = findViewById(R.id.EtvSecondDigit);
        mEtvThird = findViewById(R.id.EtvThirdDigit);
        mEtvFourth = findViewById(R.id.EtvFourthDigit);
        mEtvFifth = findViewById(R.id.EtvFifthDigit);
        mEtvSixth = findViewById(R.id.EtvSixthDigit);
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
        setTextChangeListener();
        setTextChangeListener1();
        setTextChangeListener2();
        setTextChangeListener3();
        setTextChangeListener4();
        setTextChangeListener5();
    }

    private void setPhoneNumber() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        String phoneNumber = pref.getString(name.phoneNumber, "454");
        mTvMobileNumber.setText(phoneNumber);
    }
    boolean isButtonEnabled2 = false;

    private void setListeners() {

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
    //this function monitors the edittext for changes
    private void setTextChangeListener() {
        mEtvFirst.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 1 || s.toString().trim().length() > 1) {
                    isButtonEnabled2 = false;

                } else {
                    isButtonEnabled2 = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void setTextChangeListener1() {
        mEtvSecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 1 || s.toString().trim().length() > 1) {
                    isButtonEnabled2 = false;

                } else {
                    isButtonEnabled2 = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void setTextChangeListener2() {
        mEtvThird.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 1 || s.toString().trim().length() > 1) {
                    isButtonEnabled2 = false;

                } else {
                    isButtonEnabled2 = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void setTextChangeListener3() {
        mEtvFourth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 1 || s.toString().trim().length() > 1) {
                    isButtonEnabled2 = false;

                } else {
                    isButtonEnabled2 = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void setTextChangeListener4() {
        mEtvFifth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 1 || s.toString().trim().length() > 1) {
                    isButtonEnabled2 = false;

                } else {
                    isButtonEnabled2 = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    private void setTextChangeListener5() {
        mEtvSixth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 1 || s.toString().trim().length() > 1) {
                    isButtonEnabled2 = false;

                } else {
                    isButtonEnabled2 = true;

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}