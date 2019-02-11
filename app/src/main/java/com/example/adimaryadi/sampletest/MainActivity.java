package com.example.adimaryadi.sampletest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    public static final String EXTRA_MESSAGE = "com.example.adimaryadi.sampletest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email       =   (EditText) findViewById(R.id.Email);
        password    =   (EditText) findViewById(R.id.Password);

        final Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email     =  email.getText().toString();
                String Password  =  password.getText().toString();
                if (Email.equals("adimaryadiinten@gmail.com") && Password.equals("1adimaryadi1")) {
                    Intent Dashboard    =   new Intent(MainActivity.this, Dashboard.class);
                    Dashboard.putExtra(EXTRA_MESSAGE, Email);
                    startActivity(Dashboard);
                    finish();
                } else {
                    AlertDialog.Builder peringatan  =  new AlertDialog.Builder(MainActivity.this);
                    peringatan.setMessage(R.string.pesan).setPositiveButton(R.string.coba, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.d("pesan","coba lagi");
                        }
                    })
                    .setNegativeButton(R.string.batal, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            System.exit(0);
                        }
                    });
                    peringatan.setCancelable(false);
                    peringatan.create().show();
                }
            }
        });
    }
}