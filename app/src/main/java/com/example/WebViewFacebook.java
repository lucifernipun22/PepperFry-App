package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.pepperfry.R;

public class WebViewFacebook extends AppCompatActivity {

    private WebView webView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_facebook);
        webView = findViewById(R.id.wvGoogle);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/");

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
            // Toast.makeText(this,"Going Back",Toast.LENGTH_SHORT).show();
        } else {
            //  Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }

    }
}