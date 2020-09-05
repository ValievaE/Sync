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

public class EveningActivity extends AppCompatActivity {
    private TextView textEvening;
    private Button buttonEvening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        textEvening = findViewById(R.id.textViewTimeEvening);
        buttonEvening = findViewById(R.id.buttonEvening);

        final DateFormat timeFormat = new SimpleDateFormat("HH:MM:SS", Locale.getDefault());

        buttonEvening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textEvening.setText(timeFormat.format(Calendar.getInstance().getTime()));
            }
        });

    }
}