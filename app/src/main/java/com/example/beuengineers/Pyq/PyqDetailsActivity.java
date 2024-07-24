package com.example.beuengineers.Pyq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.beuengineers.R;
import com.example.beuengineers.databinding.ActivityPyqDetailsBinding;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PyqDetailsActivity extends AppCompatActivity {

    ActivityPyqDetailsBinding binding;
    //own write code one line
    PDFView pdfViewPyq;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPyqDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        String link=getIntent().getStringExtra("pdfLink");
        //own write  only two line
        pdfViewPyq=findViewById(R.id.pdfViewPyq);
        progressBar=findViewById(R.id.progressPyq);

        ShowPdf(link);
    }
    private void ShowPdf(String link) {

        OkHttpClient client=new OkHttpClient();
        Request request= new Request.Builder().url(link).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                binding.progressPyq.setVisibility(View.GONE);
                Toast.makeText(PyqDetailsActivity.this, "ERROR"+e.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {

                assert response.body() != null;
                InputStream inputStream=response.body().byteStream();
                runOnUiThread(()->{
                    binding.pdfViewPyq.fromStream(inputStream)
                            .onLoad(nbPages -> {
                                //hide the progress bar when pdf file loaded
                                binding.progressPyq.setVisibility(View.GONE);
                            }).load();
                });
            }
        });
    }
}