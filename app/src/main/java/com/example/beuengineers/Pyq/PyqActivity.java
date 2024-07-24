package com.example.beuengineers.Pyq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.beuengineers.Recyclernotes.Adapter;
import com.example.beuengineers.Recyclernotes.Model;
import com.example.beuengineers.databinding.ActivityNotesBinding;
import com.example.beuengineers.databinding.ActivityPyqBinding;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import java.util.ArrayList;
import java.util.Objects;

public class PyqActivity extends AppCompatActivity {

    ActivityPyqBinding binding;

    FirebaseFirestore firestore;
    ArrayList<Model> chapterListPyq;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPyqBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        firestore=FirebaseFirestore.getInstance();
        chapterListPyq=new ArrayList<>();
        adapter=new Adapter(this,chapterListPyq);
        binding.pyqrcv.setAdapter(adapter);
        binding.pyqrcv.setLayoutManager(new LinearLayoutManager(this));

        LoadData();

        binding.searchViewPyq.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filterList(s.toString());
            }
        });


    }


    private void filterList(String text) {

        java.util.List<Model> filteredList = new ArrayList<>();
        for (Model item : chapterListPyq) {

            if (item.getChapter().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        if (filteredList.isEmpty()) {
            binding.data.setVisibility(View.VISIBLE);
        } else {
            adapter.setFilteredList(filteredList);
            binding.data.setVisibility(View.GONE);
        }
    }

    private void LoadData() {
        chapterListPyq.clear();
        firestore.collection("Pyq").orderBy("id", Query.Direction.ASCENDING)
                .addSnapshotListener((value, error) -> {

                    if (error != null){
                        Toast.makeText(this, "Chapter Loaded", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    for (DocumentChange dc : Objects.requireNonNull(value).getDocumentChanges()){
                        if (dc.getType()==DocumentChange.Type.ADDED){
                            chapterListPyq.add(dc.getDocument().toObject(Model.class));
                        }

                        adapter.notifyDataSetChanged();
                    }

                });



    }
}