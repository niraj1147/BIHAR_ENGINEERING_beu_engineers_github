package com.example.beuengineers.Syllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.beuengineers.R;

public class SyllabusActivity extends AppCompatActivity {

    Button cse,ce,ece,ee,it,lt,ie,eee,me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);

        cse=findViewById(R.id.cse);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, CseActivity.class);
                startActivity(intent);
            }
        });


        ce=findViewById(R.id.ce);
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, CivilActivity.class);
                startActivity(intent);
            }
        });


        ece=findViewById(R.id.ece);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, EceActivity.class);
                startActivity(intent);
            }
        });


        ee=findViewById(R.id.ee);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, EeActivity.class);
                startActivity(intent);
            }
        });


        it=findViewById(R.id.it);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, ItActivity.class);
                startActivity(intent);
            }
        });

        lt=findViewById(R.id.lt);
        lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, LtActivity.class);
                startActivity(intent);
            }
        });

        ie=findViewById(R.id.ie);
        ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, IeActivity.class);
                startActivity(intent);
            }
        });

        eee=findViewById(R.id.eee);
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, EeeActivity.class);
                startActivity(intent);
            }
        });

        me=findViewById(R.id.me);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SyllabusActivity.this, MechanicalActivity.class);
                startActivity(intent);
            }
        });


    }
}