package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView2);
    }

    public void sum(View v) {
        if (editText.getText().toString().matches("")) {
        } else {


            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int result = a + b;

            textView.setText("Sonuç : " + result);
        }
    }

    public void deduct(View v) {
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int result = a - b;

        textView.setText("Sonuç : " + result);

    }

    public void multiply(View v) {
        int a = Integer.parseInt(editText.getText().toString());
        int b = Integer.parseInt(editText2.getText().toString());
        int result = a * b;

        textView.setText("Sonuç : " + result);
    }

    public void divide(View V) {
        float a = Integer.parseInt(editText.getText().toString());
        float b = Integer.parseInt(editText2.getText().toString());
        float result = a / b;

        textView.setText("Sonuç : " + result);

    }


}


