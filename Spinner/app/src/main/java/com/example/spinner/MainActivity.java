package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identifikasi
        spinner1 = findViewById(R.id.spinner1);

        //Membuat list
        List<String> item = new ArrayList<String>();
        item.add("Muslim");
        item.add("Kristen");
        item.add("Katolik");
        item.add("Hindu");
        item.add("Buddha");
        item.add("Konghucu");

        //Membuat ArrayAdapter
        ArrayAdapter data =new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, item);

        //Menentukan style
        data.setDropDownViewResource(android.R.layout.simple_list_item_checked);

        //Sematkan pada spinner
        spinner1.setAdapter(data);
    }
    public void pilih(View view){
        String pesan = "";
        pesan = spinner1.getSelectedItem().toString();
        Toast.makeText(MainActivity.this, pesan, Toast.LENGTH_SHORT).show();
    }
}