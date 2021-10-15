package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText nim, nama, alamat;
    Button view;
    RadioButton laki, pr;
    String jk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = (EditText) findViewById(R.id.nim_16312);
        nama = (EditText) findViewById(R.id.nama_16312);
        alamat = (EditText) findViewById(R.id.alamat_16312);
        view = (Button) findViewById(R.id.viewdt_162312);
        laki = (RadioButton) findViewById(R.id.rblaki_162312);
        pr = (RadioButton) findViewById(R.id.rbprem_162312);

        laki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jk = "Laki-Laki";
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jk = "Perempuan";
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hasan = new Intent(MainActivity.this,Main2Activity.class);
                hasan.putExtra("Nim", nim.getText().toString());
                hasan.putExtra("Nama", nama.getText().toString());
                hasan.putExtra("Alamat", alamat.getText().toString());
                hasan.putExtra("JK",jk);
                startActivity(hasan);
            }
        });
    }
}