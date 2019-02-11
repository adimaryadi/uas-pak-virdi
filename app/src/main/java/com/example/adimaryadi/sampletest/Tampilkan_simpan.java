package com.example.adimaryadi.sampletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class Tampilkan_simpan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkan_simpan);
        Intent tampil       =  getIntent();
        String[] dataform   =  tampil.getStringArrayExtra("data");
        for (int i = 0; i < dataform.length; i++) {
            Log.d("pesan","data dari form " + dataform[i]);
        }

    }
}
