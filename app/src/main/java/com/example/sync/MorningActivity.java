package com.example.sync;

import android.content.Intent;

import java.text.SimpleDateFormat;

import android.os.Bundle;

import java.text.DateFormat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import java.util.Locale;

public class MorningActivity extends AppCompatActivity {
    private TextView timeMorning;
    private Button buttonMorning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);

        timeMorning = findViewById(R.id.textViewTimeMorning);
        buttonMorning = findViewById(R.id.buttonMorning);

        final DateFormat timeFormat = new SimpleDateFormat("HH:MM:SS", Locale.getDefault());

        buttonMorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeMorning.setText(timeFormat.format(Calendar.getInstance().getTime()));
            }
        });

    }

}