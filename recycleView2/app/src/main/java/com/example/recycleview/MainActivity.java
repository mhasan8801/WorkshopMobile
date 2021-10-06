package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<versions> versionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        initData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
        recyclerView.setAdapter(versionsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {

        versionsList = new ArrayList<>();

        versionsList.add(new versions("Android 10", "Version 10", "Api Level 29", "Android 10 Version 10 Api Level 29"));
        versionsList.add(new versions("Pie", "Version 9", "Api Level 28", "Pie Version 9 Api Level 28"));
        versionsList.add(new versions("Oreo", "Version 8", "Api Level 27", "Oreo Version 8 Api Level 27"));
        versionsList.add(new versions("Nougat", "Version 7", "Api Level 26", "Nougat Version 7 Api Level 26"));
        versionsList.add(new versions("Marshmalow", "Version 6", "Api Level 25", "Marshmalow Version 6 Api Level 25"));
        versionsList.add(new versions("Lollipop", "Version 5.1", "Api Level 24", "Lollipop Version 5.1 Api Level 24"));
        versionsList.add(new versions("Lollipop", "Version 5.0", "Api Level 23", "Lollipop Version 5.0 Api Level 23"));
        versionsList.add(new versions("Kitkat", "Version 4.1", "Api Level 22", "Kitkat Version 4.1 Api Level 22"));
        versionsList.add(new versions("Kitkat", "Version 4.0", "Api Level 21", "Kitkat Version 4.0 Api Level 21"));
    }
}