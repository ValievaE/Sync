package com.example.sync;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AfternoonActivity extends AppCompatActivity {
    private TextView textAfternoon;
    private Button buttonAfternoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);

        textAfternoon = findViewById(R.id.textViewTimeAfternoon);
        buttonAfternoon = findViewById(R.id.buttonAfternoon);

        final DateFormat timeFormat = new SimpleDateFormat("HH:MM:SS", Locale.getDefault());

        buttonAfternoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAfternoon.setText(timeFormat.format(Calendar.getInstance().getTime()));
            }
        });
    }
}