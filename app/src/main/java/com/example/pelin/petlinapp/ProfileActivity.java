package com.example.pelin.petlinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button sahiplendirme,kayip,esbul,yardim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        sahiplendirme= (Button) findViewById(R.id.sahiplendirme);
        kayip= (Button) findViewById(R.id.kayip);
        esbul= (Button) findViewById(R.id.esbul);
        yardim= (Button) findViewById(R.id.yardim);


        sahiplendirme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ProfileActivity.this,Silan.class);
                startActivity(i);}

        });
        kayip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(ProfileActivity.this,Kilan.class);
                startActivity(i2);}

        });
        yardim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(ProfileActivity.this,Yilan.class);
                startActivity(i3);}

        });
        esbul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(ProfileActivity.this,Eilan.class);
                startActivity(i4);}

        });
    }
}
