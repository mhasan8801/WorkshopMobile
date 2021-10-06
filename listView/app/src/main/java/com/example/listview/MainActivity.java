package com.example.listview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"HMJ TI", "HMJ MNA", "HMJ PP", "HMJ TEKNIK", "HMJ KESEHATAN", "HMJ TP", "HMJ PETERNAKAN", "HMJ BKP" };
    String mDescription[] = {"HMJ TI Description", "HMJ MNA Description", "HMJ PP Description", "HMJ TEKNIK Description",
            "HMJ KESEHATAN Description", "HMJ TP Description", "HMJ PETERNAKAN Description", "HMJ BKP Description" };
    int images[] = {R.drawable.hmjti, R.drawable.hmjmna, R.drawable.hmjpp, R.drawable.hmjteknik, R.drawable.hmjkesehatan,
            R.drawable.hmjtp, R.drawable.hmjpeternakan, R.drawable.hmjbkp } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);

        MyAdapater adapater = new MyAdapater(this, mTitle, mDescription, images );
        listView.setAdapter(adapater);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
              if ( position == 0) {
                  Toast.makeText(MainActivity.this, "HMJ TI Description", Toast.LENGTH_SHORT).show();
              }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ MNA Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ PP Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ TEKNIK Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ KESEHATAN Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ TP Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ PETERNAKAN Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "HMJ BKP Description", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class MyAdapater extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapater (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImgs=imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false );
            ImageView images=row.findViewById(R.id.image);
            TextView myTitle= row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }
}