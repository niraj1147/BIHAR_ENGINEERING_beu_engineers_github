package com.example.beuengineers.Application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.example.beuengineers.R;

public class ApplicationActivity extends AppCompatActivity {


    private WebView webviewAplication;
    private Button firstApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);

        webviewAplication = findViewById(R.id.webviewAplication);
        //
        firstApplication = findViewById(R.id.firstApplication);


        //
        webviewAplication.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webviewAplication.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Initially hide the WebView
        webviewAplication.setVisibility(View.GONE);

        // Load the first file by default
        // webView.loadUrl("file:///android_asset/1mit.html");

        firstApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webviewAplication.loadUrl("file:///android_asset/1application.html");
                // Show the WebView when the button is clicked
                webviewAplication.setVisibility(View.VISIBLE);
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (webviewAplication.getVisibility() == View.VISIBLE && webviewAplication.canGoBack()) {
            // If the WebView is visible and can go back, go back in WebView history
            webviewAplication.setVisibility(View.GONE);
        } else {
            // If the WebView is visible, but cannot go back, hide the WebView
            if (webviewAplication.getVisibility() == View.VISIBLE) {
                webviewAplication.setVisibility(View.GONE);
            } else {
                // If the WebView is not visible, perform default back press behavior
                super.onBackPressed();
            }
        }
    }

}