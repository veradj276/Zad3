package com.example.zadatak3vd;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvGimnazija;
    TextView odeljenje;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGimnazija = (TextView) findViewById(R.id.textViewGimnazija);
        odeljenje = (TextView) findViewById(R.id.textViewOdeljenje);

    }

    public void onClickGimp(View view){
        tvGimnazija.setText("radi");
    }
    public void onClickOdelj(View view){
        odeljenje.setText("III5");
    }
}