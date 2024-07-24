package com.example.beuengineers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.beuengineers.R;

public class DeveloperActivity extends AppCompatActivity {

    WebView webView;
    public String filename = "developer.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        webView = (WebView) findViewById(R.id.developer);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + filename);

    }
}