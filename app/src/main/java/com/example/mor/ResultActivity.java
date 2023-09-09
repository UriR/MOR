package com.example.mor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private int exNumber;
    private int RightNumber;
    private TextView exNumberText;
    private TextView RightNumberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        exNumber = getIntent().getIntExtra("countex",0);
        RightNumber = getIntent().getIntExtra("countRight", 0);
        exNumberText = findViewById(R.id.countexText);
        RightNumberText = findViewById(R.id.RightText);
        exNumberText.setText(exNumber);
        RightNumberText.setText(RightNumber);

    }
}