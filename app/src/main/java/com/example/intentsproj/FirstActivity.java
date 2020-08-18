package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public String myExtra = "text";
    Button btn;
    TextView txtMessage;

    public String num1;
    public String num2;

    EditText edit1,edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn = (Button) findViewById(R.id.button);
        edit1=(EditText) findViewById(R.id.inputNum1);
        edit2=(EditText) findViewById(R.id.inputNum2);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                //get strings from edit text objects
                 num1 = edit1.getText().toString();
                 num2 = edit2.getText().toString();

                Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);

                myIntent.putExtra("Num1", num1);
                myIntent.putExtra("Num2", num2);
                startActivity(myIntent);


                Context context = getApplicationContext();
                CharSequence text = "OK button is just clicked";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,text,duration);
                toast.show();

                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 10);
                //myIntent.putExtra("MAIN_EXTRA", myExtra);


            }
        });

        //creating the layoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the view object as defind in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast,(ViewGroup)
                findViewById(R.id.custom_toast_layout));

        //creating the toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

    }


}


