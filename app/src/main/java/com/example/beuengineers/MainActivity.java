package com.example.beuengineers;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.beuengineers.Application.ApplicationActivity;
import com.example.beuengineers.CollegeList.CollegeListActivity;
import com.example.beuengineers.Placements.PlacementActivity;
import com.example.beuengineers.Recyclernotes.NotesActivity;
import com.example.beuengineers.Pyq.PyqActivity;
import com.example.beuengineers.Syllabus.SyllabusActivity;
import com.google.android.material.navigation.NavigationView;
import com.example.beuengineers.R;

public class MainActivity extends AppCompatActivity {
    CardView notescv,topcollegelist,pyq,results,syllabus,placement,collegepredict,applications;
    //drawer layout
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    ImageButton imageButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //notes section
        notescv=findViewById(R.id.notescv);
        notescv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intent);
            }
        });

        //top college list section
        topcollegelist=findViewById(R.id.topcollegelist);
        topcollegelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, CollegeListActivity.class);
                startActivity(intent);
            }
        });

        //PyQ Section
        pyq=findViewById(R.id.pyq);
        pyq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PyqActivity.class);
                startActivity(intent);
            }
        });



        //syllabus section
        syllabus=findViewById(R.id.syllabus);
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SyllabusActivity.class);
                startActivity(intent);
            }
        });

        //placement section
        placement=findViewById(R.id.placement);
        placement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PlacementActivity.class);
                startActivity(intent);
            }
        });

        //placement section
        placement=findViewById(R.id.placement);
        placement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PlacementActivity.class);
                startActivity(intent);
            }
        });



        //Application
        applications=findViewById(R.id.applications);
        applications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ApplicationActivity.class);
                startActivity(intent);
            }
        });


        //image button
        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, PrivacyActivity.class);
                startActivity(intent);
            }
        });


        
    }
}