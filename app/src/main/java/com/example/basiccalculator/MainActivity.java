package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunc(View view){
        EditText textOne = (EditText) findViewById(R.id.inputOne);
        int one = Integer.parseInt(textOne.getText().toString());
        EditText textTwo = (EditText) findViewById(R.id.inputTwo);
        int two = Integer.parseInt(textTwo.getText().toString());
        int total = one + two;

        goToActivity2(Integer.toString(total));
    }

    public void subFunc(View view){
        EditText textOne = (EditText) findViewById(R.id.inputOne);
        int one = Integer.parseInt(textOne.getText().toString());
        EditText textTwo = (EditText) findViewById(R.id.inputTwo);
        int two = Integer.parseInt(textTwo.getText().toString());
        int total = one - two;

        goToActivity2(Integer.toString(total));
    }

    public void multFunc(View view){
        EditText textOne = (EditText) findViewById(R.id.inputOne);
        int one = Integer.parseInt(textOne.getText().toString());
        EditText textTwo = (EditText) findViewById(R.id.inputTwo);
        int two = Integer.parseInt(textTwo.getText().toString());
        int total = one * two;

        goToActivity2(Integer.toString(total));
    }

    public void divFunc(View view){
        EditText textOne = (EditText) findViewById(R.id.inputOne);
        int one = Integer.parseInt(textOne.getText().toString());
        EditText textTwo = (EditText) findViewById(R.id.inputTwo);
        int two = Integer.parseInt(textTwo.getText().toString());
        int total = one / two;

        goToActivity2(Integer.toString(total));
    }

    public void goToActivity2(String val){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", val);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}