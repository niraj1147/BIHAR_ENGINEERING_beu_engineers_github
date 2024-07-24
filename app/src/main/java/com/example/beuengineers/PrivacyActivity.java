package com.example.beuengineers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.beuengineers.R;

public class PrivacyActivity extends AppCompatActivity {

    WebView webView;
    public String filename = "privacy.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);


        webView = (WebView) findViewById(R.id.privacy);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + filename);
    }
}