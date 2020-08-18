package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    EditText edit1,edit2;
    TextView result1;
    int number1,number2;
    float result;
    float final_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn1=findViewById(R.id.buttonPlus);
        btn2=findViewById(R.id.buttonMin);
        btn3=findViewById(R.id.buttonMult);
        btn4=findViewById(R.id.buttonSub);

        result1=findViewById(R.id.result);

        edit1=(EditText) findViewById(R.id.editNum1);
        edit2=(EditText) findViewById(R.id.editNum2);


        Intent i = getIntent();
        String s1 = i.getStringExtra("Num1");
        String s2 = i.getStringExtra("Num2");

        edit1.setText(s1);
        edit2.setText(s2);
         number1 = Integer.parseInt(s1);
         number2 = Integer.parseInt(s2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_result = number1 + number2;
                result1.setText(String.valueOf(final_result));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_result = number1 - number2;
                result1.setText(String.valueOf(final_result));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_result = number1 * number2;
                result1.setText(String.valueOf(final_result));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final_result = number1 / number2;
                result1.setText(String.valueOf(final_result));
            }
        });


    }
}