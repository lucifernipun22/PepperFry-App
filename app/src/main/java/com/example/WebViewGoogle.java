package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.pepperfry.R;

public class WebViewGoogle extends AppCompatActivity {
    private WebView webView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_google);
        webView = findViewById(R.id.wvGoogle);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

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