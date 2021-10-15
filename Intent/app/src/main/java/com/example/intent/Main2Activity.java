package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nim,nama,alamat,jk;
    Button back;
    Intent san;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nim = (TextView) findViewById(R.id.txtnim_162312);
        nama = (TextView) findViewById(R.id.txtnama_162312);
        alamat = (TextView) findViewById(R.id.txtalamat_162312);
        jk = (TextView) findViewById(R.id.txtJK_162312);
        back = (Button) findViewById(R.id.btnback_162312);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        san = getIntent();
        nim.setText("Nim : "+san.getStringExtra("Nim"));
        nama.setText("Nama : "+san.getStringExtra("Nama"));
        alamat.setText("Alamat :"+san.getStringExtra("Alamat"));
        jk.setText("Jenis Kelamin :"+san.getStringExtra("JK"));
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(Main2Activity.this,MainActivity.class));
        finish();
    }
}