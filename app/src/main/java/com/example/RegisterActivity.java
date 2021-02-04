package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.pepperfry.R;

public class RegisterActivity extends AppCompatActivity {
    private ImageView btnCross;
    private EditText etName;
    private EditText etMobile;
    private EditText etEmail;
    private EditText etPassword;
    private Button btnRegister;
    private ImageButton btnFacebook;
    private ImageButton btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
        clickListener();
        saveData1();
        saveData2();
        saveData3();
        saveData4();
    }

    //boolean isButtonEnabled = false;

    private void initViews() {
        btnCross = findViewById(R.id.imageView);
        etName = findViewById(R.id.Name);
        etMobile = findViewById(R.id.Mobile);
        etEmail = findViewById(R.id.Email);
        etPassword = findViewById(R.id.Password);
        btnRegister = findViewById(R.id.button);
        btnFacebook = findViewById(R.id.fb);
        btnGoogle = findViewById(R.id.google);
        setListeners();
        setTextChangeListener();
        setTextChangeListener1();
        setTextChangeListener2();
        setTextChangeListener3();
    }

    boolean isButtonEnabled2 = false;

    private void setListeners() {

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isButtonEnabled2) {
                    saveData1();
                    saveData2();
                    saveData3();
                    saveData4();
                    activityTriversalWithAnimation(MobileNumberVerificationActivity.class);
                } else {
                    etName.setError("Please enter valid name");
                    etMobile.setError("Enter valid Phone number");
                    etEmail.setError("Enter valid Email address");
                    etPassword.setError("Enter valid Email password");
                }
            }
        });
    }

    private void setTextChangeListener1() {
        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 3) {
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

    //this function monitors the edittext for changes
    private void setTextChangeListener() {
        etMobile.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 10 || s.toString().trim().length() > 10) {
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

        etEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!s.toString().trim().contains("@gmail.com")) {
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
        etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().length() < 8 || s.toString().trim().length() > 12) {
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


    private void activityTriversalWithAnimation(Class classname) {
        Intent intent = new Intent(RegisterActivity.this, classname);
        startActivity(intent);
    }

    private void clickListener() {
        btnCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginOrRegister.class);
                startActivity(intent);
                finish();
            }
        });

        btnFacebook.setOnClickListener(v -> urlOpener("https://www.facebook.com/"));
        btnGoogle.setOnClickListener(v -> urlOpener("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession"));
    }

    private void urlOpener(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private void saveData1() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(name.phoneNumber, etMobile.getText().toString());
        editor.apply();
    }

    private void saveData2() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(name.Name, etName.getText().toString());
        editor.apply();
    }

    private void saveData3() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(name.email, etEmail.getText().toString());
        editor.apply();
    }

    private void saveData4() {
        sharedPrefNames name = new sharedPrefNames();
        SharedPreferences pref = getSharedPreferences(name.SHARED_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(name.password, etPassword.getText().toString());
        editor.apply();
    }

}