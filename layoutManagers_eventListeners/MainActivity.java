package com.example.termwork_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;

    EditText text1,text2,text3;

    String name,usn,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        text1=findViewById(R.id.inputFld1);
        text2=findViewById(R.id.inputFld2);
        text3=findViewById(R.id.inputFld3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=text1.getText().toString();
                usn=text2.getText().toString();
                dept=text3.getText().toString();

                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("name",name);
                i.putExtra("usn",usn);
                i.putExtra("dept",dept);

                startActivity(i);

            }
        });
    }
}