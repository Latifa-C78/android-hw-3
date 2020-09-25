package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.button);
        final EditText na = findViewById(R.id.editTextTextPersonName);
       final EditText age = findViewById(R.id.editTextTextPersonName2);
        final EditText myjob = findViewById(R.id.editTextTextPersonName3);
       final EditText phone = findViewById(R.id.editTextTextPersonName4);
        final EditText email = findViewById(R.id.editTextTextPersonName5);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name= na.getText().toString();
                String a = age.getText().toString();
                String m = myjob.getText().toString();
                String p = phone.getText().toString();
                String e = email.getText().toString();
                Intent d = new Intent(MainActivity.this,MainActivity2.class);
                d.putExtra("latifa",name);
                d.putExtra("latif",a);
                d.putExtra("lati",m);
                d.putExtra("lat",p);
                d.putExtra("la",e);
                startActivity(d);
            }
        });

    }
}