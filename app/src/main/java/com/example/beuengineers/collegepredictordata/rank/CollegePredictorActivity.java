////package com.example.beuengineers.collegepredictordata.rank;
////
////import androidx.annotation.NonNull;
////import androidx.appcompat.app.AppCompatActivity;
////
////import android.os.Bundle;
////import android.view.View;
////import android.widget.Button;
////import android.widget.Toast;
////
////import com.example.beuengineers.R;
////import com.google.android.gms.tasks.OnFailureListener;
////import com.google.android.gms.tasks.OnSuccessListener;
////import com.google.firebase.FirebaseApp;
////import com.google.firebase.firestore.DocumentReference;
////import com.google.firebase.firestore.FirebaseFirestore;
////
////import java.util.ArrayList;
////import java.util.HashMap;
////import java.util.List;
////import java.util.Map;
////
////public class CollegePredictorActivity extends AppCompatActivity {
////
////    private Button button;
////    private FirebaseFirestore db;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_college_predictor);
////
////        FirebaseApp.initializeApp(this);
////        db = FirebaseFirestore.getInstance();
////
////        button = findViewById(R.id.buttonpre);
////        button.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                storeRankData();
////            }
////        });
////    }
////
//////    private void getFilteredRankData() {
//////        CollectionReference rankCollection = db.collection("collegepredictor");
//////
//////        // Query to fetch documents where "Closing Rank" is greater than 2000
//////        Query query = rankCollection.whereGreaterThan("Closing Rank", 2000);
//////
//////        query.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//////            @Override
//////            public void onComplete(@NonNull Task<QuerySnapshot> task) {
//////                if (task.isSuccessful()) {
//////                    for (QueryDocumentSnapshot document : task.getResult()) {
//////                        if (document.exists()) {
//////                            Map<String, Object> rankData = document.getData();
//////                            // Log the data or do something with it
//////                            Log.d(TAG, "DocumentSnapshot data: " + rankData);
//////                            // You can also display it in a Toast or update the UI
//////                            Toast.makeText(CollegePredictorActivity.this, rankData.toString(), Toast.LENGTH_SHORT).show();
//////                        }
//////                    }
//////                } else {
//////                    Log.w(TAG, "Error getting documents.", task.getException());
//////                    Toast.makeText(CollegePredictorActivity.this, "Error fetching data: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//////                }
//////            }
//////        });
//////    }
////
////
////    private void storeRankData() {
////        List<Map<String, Object>> rankList = new ArrayList<>();
////
////        // Add your rank data here
////        Map<String, Object> rank1 = new HashMap<>();
////        rank1.put("Institute", "Indian Institute of Technology Bhubaneswar");
////        rank1.put("Academic Program Name", "Civil Engineering (4 Years, Bachelor of Technology)");
////        rank1.put("Quota", "AI");
////        rank1.put("Seat Type", "OPEN");
////        rank1.put("Gender", "NA");
////        rank1.put("Opening Rank", 5802);
////        rank1.put("Closing Rank", 6470);
////        rank1.put("Year", 2017);
////        rank1.put("Round", 1);
////        rankList.add(rank1);
////
////        Map<String, Object> rank2 = new HashMap<>();
////        rank2.put("Institute", "Indian Institute of Technology Bhubaneswar");
////        rank2.put("Academic Program Name", "Civil Engineering (4 Years, Bachelor of Technology)");
////        rank2.put("Quota", "AI");
////        rank2.put("Seat Type", "OBC-NCL");
////        rank2.put("Gender", "NA");
////        rank2.put("Opening Rank", 1709);
////        rank2.put("Closing Rank", 2406);
////        rank2.put("Year", 2017);
////        rank2.put("Round", 1);
////        rankList.add(rank2);
////
////        Map<String, Object> rank3 = new HashMap<>();
////        rank3.put("Institute", "Indian Institute of Technology Bhubaneswar");
////        rank3.put("Academic Program Name", "Civil Engineering (4 Years, Bachelor of Technology)");
////        rank3.put("Quota", "AI");
////        rank3.put("Seat Type", "OBC-NCL (PwD)");
////        rank3.put("Gender", "NA");
////        rank3.put("Opening Rank", 69);
////        rank3.put("Closing Rank", 69);
////        rank3.put("Year", 2017);
////        rank3.put("Round", 1);
////        rankList.add(rank3);
////
////        Map<String, Object> rank4 = new HashMap<>();
////        rank4.put("Institute", "Indian Institute of Technology Bhubaneswar");
////        rank4.put("Academic Program Name", "Civil Engineering (4 Years, Bachelor of Technology)");
////        rank4.put("Quota", "AI");
////        rank4.put("Seat Type", "SC");
////        rank4.put("Gender", "NA");
////        rank4.put("Opening Rank", 1030);
////        rank4.put("Closing Rank", 1161);
////        rank4.put("Year", 2017);
////        rank4.put("Round", 1);
////        rankList.add(rank4);
////
////        Map<String, Object> rank5 = new HashMap<>();
////        rank5.put("Institute", "Indian Institute of Technology Bhubaneswar");
////        rank5.put("Academic Program Name", "Civil Engineering (4 Years, Bachelor of Technology)");
////        rank5.put("Quota", "AI");
////        rank5.put("Seat Type", "ST");
////        rank5.put("Gender", "NA");
////        rank5.put("Opening Rank", 448);
////        rank5.put("Closing Rank", 472);
////        rank5.put("Year", 2017);
////        rank5.put("Round", 1);
////        rankList.add(rank5);
////
////        for (Map<String, Object> rank : rankList) {
////            db.collection("collegepredictor")
////                    .add(rank)
////                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
////                        @Override
////                        public void onSuccess(DocumentReference documentReference) {
////                            Toast.makeText(CollegePredictorActivity.this, "Data stored successfully!", Toast.LENGTH_SHORT).show();
////                        }
////                    })
////                    .addOnFailureListener(new OnFailureListener() {
////                        @Override
////                        public void onFailure(@NonNull Exception e) {
////                            Toast.makeText(CollegePredictorActivity.this, "Error storing data: " + e.getMessage(), Toast.LENGTH_SHORT).show();
////                        }
////                    });
////        }
////    }
////
////}
//
//
//package com.example.beuengineers.collegepredictordata.rank;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import com.example.beuengineers.R;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.firestore.CollectionReference;
//import com.google.firebase.firestore.FirebaseFirestore;
//import com.google.firebase.firestore.Query;
//import com.google.firebase.firestore.QueryDocumentSnapshot;
//import com.google.firebase.firestore.QuerySnapshot;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class CollegePredictorActivity extends AppCompatActivity {
//
//    private Button button;
//    private FirebaseFirestore db;
//
//    private static final String TAG = "CollegePredictorActivity";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_college_predictor);
//
//        FirebaseApp.initializeApp(this);
//        db = FirebaseFirestore.getInstance();
//
//        button = findViewById(R.id.buttonpre);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getFilteredRankData();
//            }
//        });
//    }
//
//    private void getFilteredRankData() {
//        CollectionReference rankCollection = db.collection("collegepredictor");
//
//        // Query to fetch documents where "Closing Rank" is greater than 2000
//        Query query = rankCollection.whereGreaterThan("Closing Rank", 2000);
//
//        query.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                if (task.isSuccessful()) {
//                    for (QueryDocumentSnapshot document : task.getResult()) {
//                        if (document.exists()) {
//                            Map<String, Object> rankData = document.getData();
//                            // Log the data or do something with it
//                            Log.d(TAG, "DocumentSnapshot data: " + rankData);
//                            // You can also display it in a Toast or update the UI
//                            Toast.makeText(CollegePredictorActivity.this, rankData.toString(), Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                } else {
//                    Log.w(TAG, "Error getting documents.", task.getException());
//                    Toast.makeText(CollegePredictorActivity.this, "Error fetching data: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//}




package com.example.beuengineers.collegepredictordata.rank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.beuengineers.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class CollegePredictorActivity extends AppCompatActivity {

    private EditText studentRankEditText;
    private Button predictCollegeButton;
    private RecyclerView collegesRecyclerView;
    private FirebaseFirestore db;

    private List<RankData> rankDataList;
    private RankAdapter rankAdapter;

    private static final String TAG = "CollegePredictorActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_predictor);

        FirebaseApp.initializeApp(this);
        db = FirebaseFirestore.getInstance();

        studentRankEditText = findViewById(R.id.studentRankEditText);
        predictCollegeButton = findViewById(R.id.predictCollegeButton);
        collegesRecyclerView = findViewById(R.id.collegesRecyclerView);

        collegesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        rankDataList = new ArrayList<>();
        rankAdapter = new RankAdapter(rankDataList);
        collegesRecyclerView.setAdapter(rankAdapter);

        predictCollegeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rankInput = studentRankEditText.getText().toString();
                if (!rankInput.isEmpty()) {
                    int studentRank = Integer.parseInt(rankInput);
                    getFilteredRankData(studentRank);
                } else {
                    Toast.makeText(CollegePredictorActivity.this, "Please enter a rank", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void getFilteredRankData(int studentRank) {
        CollectionReference rankCollection = db.collection("collegepredictor");

        // Query to fetch documents where "Closing Rank" is greater than the entered rank
        Query query = rankCollection.whereGreaterThan("Closing Rank", studentRank);

        query.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    rankDataList.clear();  // Clear previous results
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        if (document.exists()) {
                            RankData rankData = document.toObject(RankData.class);
                            rankDataList.add(rankData);
                        }
                    }
                    rankAdapter.notifyDataSetChanged();  // Notify adapter about data changes
                } else {
                    Log.w(TAG, "Error getting documents.", task.getException());
                    Toast.makeText(CollegePredictorActivity.this, "Error fetching data: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
