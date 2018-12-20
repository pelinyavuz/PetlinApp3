package com.example.pelin.petlinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Silanver extends AppCompatActivity {
    EditText edtsehir,aciklama;
    Button sec,ekle,yayinla;
    TextView txtilan;
    Spinner spnyas;
    Spinner spnirk;
    Spinner spnpet;
    Spinner spncins;

    List<String> petlist;
    List<String> cinslist;
    List<String> yaslist;
    List<String> irklist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silanver);
        listedoldur();
        tanimla();
    }

    public void tanimla(){
        txtilan = (TextView)findViewById(R.id.txtilan);
        edtsehir = (EditText)findViewById(R.id.edtsehir) ;

        spncins = (Spinner)findViewById(R.id.spncins);
        spnirk = (Spinner)findViewById(R.id.spnirk);
        spnpet = (Spinner)findViewById(R.id.spnpet);
        spnyas = (Spinner)findViewById(R.id.spnyas);

        ArrayAdapter<String> petlistAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,petlist);
        petlistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnpet.setAdapter(petlistAdapter);
        ArrayAdapter<String> yaslistAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,yaslist);
        yaslistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnyas.setAdapter(yaslistAdapter);
        ArrayAdapter<String> cinslistAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cinslist);
        cinslistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spncins.setAdapter(cinslistAdapter);
        ArrayAdapter<String> irklistAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,irklist);
        irklistAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnirk.setAdapter(irklistAdapter);

        aciklama = (EditText)findViewById(R.id.aciklama);

        ekle = (Button)findViewById(R.id.ekle);
        sec = (Button)findViewById(R.id.sec);
        yayinla = (Button)findViewById(R.id.yayinla);






        yayinla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Silanver.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }

    public void listedoldur(){
        petlist = new ArrayList<>();
        yaslist = new ArrayList<>();
        cinslist = new ArrayList<>();
        irklist  = new ArrayList<>();

        petlist.add("Seçiniz");
        petlist.add("Kedi");
        petlist.add("Köpek");
        petlist.add("Kuş");

        yaslist.add("Seçiniz");
        yaslist.add("Yavru (0-6 aylık)");
        yaslist.add("Genç (6 aylık - 2 yaş)");
        yaslist.add("Yetişkin (2 - 7 yaş");
        yaslist.add("Yaşlı (7 yaş ve üzeri)");

        cinslist.add("Seçiniz");
        cinslist.add("Dişi");
        cinslist.add("Erkek");

        irklist.add("Seçiniz");
        irklist.add("Küçük Boy");
        irklist.add("Orta Boy");
        irklist.add("Büyük Boy");




    }



}
