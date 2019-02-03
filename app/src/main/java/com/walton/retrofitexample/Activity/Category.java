package com.walton.retrofitexample.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.walton.retrofitexample.R;



public class Category extends AppCompatActivity {
    Button btnMarketVisit, btnORderManagement, btnIMS, btnCollection;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        mContext = this;



        btnCollection = findViewById(R.id.btnCollection);
        btnIMS = findViewById(R.id.btnImS);
        btnMarketVisit = findViewById(R.id.btnMarketvisit);
        btnCollection = findViewById(R.id.btnCollection);
        btnORderManagement=findViewById(R.id.btnOrderMangement);
        btnORderManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          Intent intent = new Intent(mContext, CreateuserActivity.class);
          startActivity(intent);
            }
        });
        btnCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "On Process.......", Toast.LENGTH_SHORT).show();
            }
        });
        btnMarketVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "On Process.......", Toast.LENGTH_SHORT).show();
            }
        });
        btnIMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "On Process.......", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
