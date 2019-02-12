package com.example.adimaryadi.sampletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DaftarMahasiswa extends AppCompatActivity {


    private EditText nama, email, password,no_telepon,alamat;
    public String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_mahasiswa);


        final Button kembali    =   findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        nama        =  (EditText) findViewById(R.id.nama0);
        email       =  (EditText) findViewById(R.id.email);
        password    =  (EditText) findViewById(R.id.password);
        no_telepon  =  (EditText) findViewById(R.id.telepon);
        alamat      =  (EditText) findViewById(R.id.alamat4);

        final Button simpan     =   findViewById(R.id.simpan);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nama         =  nama.getText().toString();
                String Email        =  email.getText().toString();
                String Passwrod     =  password.getText().toString();
                String No_telepon   =  no_telepon.getText().toString();
                String Alamat       =  alamat.getText().toString();

                Intent Tampilan_simpan  =  new Intent(DaftarMahasiswa.this, Tampilkan_simpan.class);
                final String[] data     =  new String[] {Nama,Email,Passwrod,No_telepon,Alamat};
                Tampilan_simpan.putExtra("data", data);
                startActivity(Tampilan_simpan);
            }
        });
    }
}