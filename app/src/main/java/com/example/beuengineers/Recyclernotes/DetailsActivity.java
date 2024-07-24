package com.example.beuengineers.Recyclernotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.beuengineers.R;
import com.example.beuengineers.databinding.ActivityDetailsBinding;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding binding;
    //own write code one line
    PDFView pdfView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String link=getIntent().getStringExtra("pdfLink");
        //own write  only two line
        pdfView=findViewById(R.id.pdfView);
        progressBar=findViewById(R.id.progress);

        ShowPdf(link);


    }

    private void ShowPdf(String link) {

        OkHttpClient client=new OkHttpClient();
        Request request= new Request.Builder().url(link).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                binding.progress.setVisibility(View.GONE);
                Toast.makeText(DetailsActivity.this, "ERROR"+e.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                assert response.body() != null;
                InputStream inputStream=response.body().byteStream();
                runOnUiThread(()->{
                 binding.pdfView.fromStream(inputStream)
                         .onLoad(nbPages -> {
                             //hide the progress bar when pdf file loaded
                             binding.progress.setVisibility(View.GONE);
                         }).load();
                });
            }
        });
    }
}