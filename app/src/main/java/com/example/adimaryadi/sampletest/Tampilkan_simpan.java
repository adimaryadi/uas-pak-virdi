package com.example.adimaryadi.sampletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tampilkan_simpan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkan_simpan);
        Intent tampil       =  getIntent();
        String[] dataform   =  tampil.getStringArrayExtra("data");
        int[] textVIews     =  {R.id.nama0,R.id.email1,R.id.password2,R.id.no_telepon3,R.id.alamat4};
        for (int i = 0; i < dataform.length; i++) {
            Log.d("pesan","data dari form " + dataform[i]);
            TextView tv  = (TextView) findViewById(textVIews[i]);
            tv.setText(dataform[i]);
        }

    }
}
