package com.example.pelin.petlinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Silan extends AppCompatActivity {

    Button sbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silan);
        sbtn=(Button) findViewById(R.id.sbtn);

        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Silan.this,Silanver.class);
                startActivity(i);
            }
        });
    }
}
