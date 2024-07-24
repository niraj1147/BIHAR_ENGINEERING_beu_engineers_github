package com.example.beuengineers.CollegeList;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.beuengineers.R;

public class CollegeListActivity extends AppCompatActivity {

    private WebView webView;
    private Button muzaffarpur, bhagalpur, gaya, nalanda, darbhanga, motihari, chhapra,
            bakhtiyarpur, sasaram, sitamarhi, madhepura, katihar, supaul, purnea, saharsa,
            jamui, banka, vaishali, nawada, kishanganj, munger, sheohar, westChamparan,aurangabad
            ,kaimur,gopalganj,madhubani,siwan,jehanabad,arwal,samastipur,khagaria,buxar,bhojpur
            ,sheikhpura,lakhisarai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);

        webView = findViewById(R.id.webview);
        //
        muzaffarpur = findViewById(R.id.muzaffarpur);
        bhagalpur = findViewById(R.id.bhagalpur);
        gaya = findViewById(R.id.gaya);
        nalanda = findViewById(R.id.nalanda);
        darbhanga = findViewById(R.id.darbhanga);
        motihari = findViewById(R.id.motihari);
        chhapra = findViewById(R.id.chhapra);
        bakhtiyarpur = findViewById(R.id.bakhtiyarpur);
        sasaram = findViewById(R.id.sasaram);
        sitamarhi = findViewById(R.id.sitamarhi);
        madhepura = findViewById(R.id.madhepura);
        katihar = findViewById(R.id.katihar);
        supaul = findViewById(R.id.supaul);
        purnea = findViewById(R.id.purnea);
        saharsa = findViewById(R.id.saharsa);
        jamui = findViewById(R.id.jamui);
        banka = findViewById(R.id.banka);
        vaishali = findViewById(R.id.vaishali);
        nawada = findViewById(R.id.nawada);
        kishanganj = findViewById(R.id.kishanganj);
        munger = findViewById(R.id.munger);
        sheohar = findViewById(R.id.sheohar);
        westChamparan = findViewById(R.id.westChamparan);
        aurangabad = findViewById(R.id.aurangabad);
        kaimur = findViewById(R.id.kaimur);
        gopalganj = findViewById(R.id.gopalganj);
        madhubani = findViewById(R.id.madhubani);
        siwan = findViewById(R.id.siwan);
        jehanabad = findViewById(R.id.jehanabad);
        arwal = findViewById(R.id.arwal);
        samastipur = findViewById(R.id.samastipur);
        khagaria = findViewById(R.id.khagaria);
        buxar = findViewById(R.id.buxar);
        bhojpur = findViewById(R.id.bhojpur);
        sheikhpura = findViewById(R.id.sheikhpura);
        lakhisarai = findViewById(R.id.lakhisarai);





        //
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Initially hide the WebView
        webView.setVisibility(View.GONE);

        // Load the first file by default
        // webView.loadUrl("file:///android_asset/1mit.html");

        muzaffarpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/1mit.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });


        bhagalpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/2bhagalpur.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        gaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/3gaya.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        nalanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/4nalanda.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        darbhanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/5darbhanga.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        motihari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/6motihari.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        chhapra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/7chhapra.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        bakhtiyarpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/8bakhtiyarpur.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        sasaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/9sersah.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        sitamarhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/10sitamarhi.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        madhepura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/11bpmandal.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        katihar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/12katihar.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        supaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/13supaul.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        purnea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/14purniya.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        saharsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/15saharsa.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        jamui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/16jamui.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        banka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/17banka.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        vaishali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/18vaishali.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        nawada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/19nabada.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        kishanganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/20kishanganj.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        munger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/21munger.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        sheohar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/22sheohar.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        westChamparan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/23webtchamparan.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        aurangabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/24aurangabad.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        kaimur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/25kaimur.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });
        gopalganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/26gopalgang.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        madhubani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/27madhubani.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        siwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/28siwan.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        jehanabad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/29jahanabad.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        arwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/30arwal.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        samastipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/31samastipur.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        khagaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/32khagaria.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        buxar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/33buxur.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        bhojpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/34bhojpur.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        sheikhpura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/35shekhpura.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });

        lakhisarai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("file:///android_asset/36lakhisarai.html");
                // Show the WebView when the button is clicked
                webView.setVisibility(View.VISIBLE);
            }
        });







    }

    @Override
    public void onBackPressed() {
        if (webView.getVisibility() == View.VISIBLE && webView.canGoBack()) {
            // If the WebView is visible and can go back, go back in WebView history
            webView.setVisibility(View.GONE);
        } else {
            // If the WebView is visible, but cannot go back, hide the WebView
            if (webView.getVisibility() == View.VISIBLE) {
                webView.setVisibility(View.GONE);
            } else {
                // If the WebView is not visible, perform default back press behavior
                super.onBackPressed();
            }
        }
    }
}