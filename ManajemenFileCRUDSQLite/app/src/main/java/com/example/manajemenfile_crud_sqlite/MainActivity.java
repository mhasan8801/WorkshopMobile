package com.example.manajemenfile_crud_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maFile(View view) {
        Intent intent = new Intent(MainActivity.this, AddFileActivity.class);
        startActivity(intent);
    }

    public void crud(View view) {
        Intent intent = new Intent(MainActivity.this, ListDataActivity.class);
        startActivity(intent);
    }
}