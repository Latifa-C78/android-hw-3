package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name = findViewById(R.id.textView);
        TextView a = findViewById(R.id.textView2);
        TextView m = findViewById(R.id.textView3);
        TextView p = findViewById(R.id.textView4);
        TextView e = findViewById(R.id.textView5);


        Bundle bb = getIntent().getExtras();
        String na =bb.getString("latifa");
        String aa =bb.getString("latif");
        String mi =bb.getString("lati");
        String nat =bb.getString("lat");
        String nai =bb.getString("la");
        name.setText(na);
        a.setText(aa);
        m.setText(mi);
        p.setText(nat);
        e.setText(nai);







    }
}