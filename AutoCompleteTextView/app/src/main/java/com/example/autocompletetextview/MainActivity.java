package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<HmjItem> hmjList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillHmjList();

        AutoCompleteTextView editText = findViewById(R.id.actv);
        AutoCompleteHmjAdapater adapter = new AutoCompleteHmjAdapater(this, hmjList);
        editText.setAdapter(adapter);
    }

    private void fillHmjList() {
        hmjList = new ArrayList<>();
        hmjList.add(new HmjItem("HMJ TI", R.drawable.hmjti));
        hmjList.add(new HmjItem("HMJ MNA", R.drawable.hmjmna));
        hmjList.add(new HmjItem("HMJ PP", R.drawable.hmjpp));
        hmjList.add(new HmjItem("HMJ TEKNIK", R.drawable.hmjteknik));
        hmjList.add(new HmjItem("HMJ KESEHATAN", R.drawable.hmjkesehatan));
        hmjList.add(new HmjItem("HMJ TP", R.drawable.hmjtp));
        hmjList.add(new HmjItem("HMJ PETERNAKAN", R.drawable.hmjpeternakan));
        hmjList.add(new HmjItem("HMJ BKP", R.drawable.hmjbkp));
    }
}