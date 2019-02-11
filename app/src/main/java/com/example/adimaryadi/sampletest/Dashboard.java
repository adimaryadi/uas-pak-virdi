package com.example.adimaryadi.sampletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent dashboard    =   getIntent();
        String pesan        =   dashboard.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textpesan  =   findViewById(R.id.email);
        textpesan.setText(pesan);

        final Button daftar =   findViewById(R.id.daftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DaftarMahasiswa   =  new Intent(Dashboard.this, DaftarMahasiswa.class);
                startActivity(DaftarMahasiswa);
            }
        });
    }
}
