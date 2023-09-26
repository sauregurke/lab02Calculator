package com.cs407.lab02calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorResult extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result);
        textView = findViewById(R.id.calcResult);
        Intent intent = getIntent();
        Integer resultInt = intent.getIntExtra("result", 0);
        textView.setText(String.valueOf(resultInt));


    }
}