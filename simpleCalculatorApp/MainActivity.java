package com.example.termwork3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputNum1;
    EditText inputNum2;
    Button add, sub, mul, div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNum1 = findViewById(R.id.num1);
        inputNum2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        result = findViewById(R.id.result);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0, num2 = 0, res = 0;
        String oper = "";

        if (TextUtils.isEmpty(inputNum1.getText().toString()) || TextUtils.isEmpty(inputNum2.getText().toString()))
            return;

        num1 = Float.parseFloat(inputNum1.getText().toString());
        num2 = Float.parseFloat(inputNum2.getText().toString());

        switch (v.getId()) {
            case R.id.add:
                oper = "+";
                res = num1 + num2;
                break;
            case R.id.sub:
                oper = "-";
                res = num1 - num2;
                break;
            case R.id.mul:
                oper = "*";
                res = num1 * num2;
                break;
            case R.id.div:
                oper = "/";
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    // Handle division by zero error
                    result.setText("Cannot divide by zero");
                    return;
                }
                break;
            default:
                break;
        }
        result.setText(String.valueOf(res));
    }
}
