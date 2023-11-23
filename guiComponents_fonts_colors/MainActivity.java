package com.example.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    Button increseFontBtn;
    Button decreseFontBtn;

    int fontSize=30;
    boolean isBtnClicked=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button=findViewById(R.id.buton);
    textView=findViewById(R.id.textDisplay);
    increseFontBtn=findViewById(R.id.increaseFont);
    decreseFontBtn=findViewById(R.id.decreseFont);

    button.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v){
            if(isBtnClicked==true){
                textView.setTextColor(getResources().getColor(R.color.black));
                isBtnClicked=false;
            } else if(isBtnClicked==false){
                textView.setTextColor(getResources().getColor(R.color.myclr));
                isBtnClicked=true;
            }
        }
    });

    increseFontBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView.setTextSize(fontSize);
            fontSize=fontSize+5;
            if(fontSize==50){
                fontSize=30;
            }
        }
    });


        decreseFontBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextSize(fontSize);
                fontSize=fontSize-5;
                if(fontSize==20){
                    fontSize=30;
                }
            }
        });

    }
}