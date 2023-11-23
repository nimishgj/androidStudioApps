package com.example.termwork_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity2 extends AppCompatActivity {

    TextView text1,text2,text3;
    String name,usn,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1=findViewById(R.id.tv1);
        text2=findViewById(R.id.tv2);
        text3=findViewById(R.id.tv3);

        Intent i =getIntent();

        name=i.getStringExtra("name");
        usn=i.getStringExtra("usn");
        dept=i.getStringExtra("dept");

        text1.setText(name);
        text2.setText(usn);
        text3.setText(dept);
    }
}