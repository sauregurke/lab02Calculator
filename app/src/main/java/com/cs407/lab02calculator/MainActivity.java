package com.cs407.lab02calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumberStr = (EditText) findViewById(R.id.secondNumber);
        try {
            Integer firstNumber = Integer.parseInt(firstNumberStr.getText().toString().trim());
            Integer secondNumber = Integer.parseInt(secondNumberStr.getText().toString().trim());

            goToActivity(firstNumber + secondNumber);
        } catch (Exception ignored){}
        //Toast.makeText(MainActivity.this, myTextField.getText(), Toast.LENGTH_LONG).show();
    }
    public void subtract(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumberStr = (EditText) findViewById(R.id.secondNumber);
        try {
            Integer firstNumber = Integer.parseInt(firstNumberStr.getText().toString().trim());
            Integer secondNumber = Integer.parseInt(secondNumberStr.getText().toString().trim());

            goToActivity(firstNumber - secondNumber);
        } catch (Exception ignored){}
        //Toast.makeText(MainActivity.this, myTextField.getText(), Toast.LENGTH_LONG).show();
    }
    public void multiply(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumberStr = (EditText) findViewById(R.id.secondNumber);
        try {
            Integer firstNumber = Integer.parseInt(firstNumberStr.getText().toString().trim());
            Integer secondNumber = Integer.parseInt(secondNumberStr.getText().toString().trim());

            goToActivity(firstNumber * secondNumber);
        } catch (Exception ignored){}
        //Toast.makeText(MainActivity.this, myTextField.getText(), Toast.LENGTH_LONG).show();
    }
    public void divide(View view) {
        EditText firstNumberStr = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumberStr = (EditText) findViewById(R.id.secondNumber);
        try {
            Integer firstNumber = Integer.parseInt(firstNumberStr.getText().toString().trim());
            Integer secondNumber = Integer.parseInt(secondNumberStr.getText().toString().trim());

            goToActivity(firstNumber / secondNumber);
        } catch (ArithmeticException e) {
            Toast.makeText(MainActivity.this, "Cannot divide by zero :(", Toast.LENGTH_LONG).show();
        } catch (Exception ignored){}
        //Toast.makeText(MainActivity.this, myTextField.getText(), Toast.LENGTH_LONG).show();
    }

    public void goToActivity(Integer i) {
        Intent intent = new Intent(this, CalculatorResult.class);
        intent.putExtra("result", i);
        startActivity(intent);
    }
}