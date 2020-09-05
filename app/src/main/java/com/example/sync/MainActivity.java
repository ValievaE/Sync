package com.example.sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Button buttonSync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSync = findViewById(R.id.buttonSync);

        buttonSync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SYNC);

                DateFormat timeFormat = new SimpleDateFormat("HH", Locale.getDefault());

                int time = Integer.parseInt(timeFormat.format(Calendar.getInstance().getTime()));

                if (time >= 6 && time < 14) {
                    intent.setData(Uri.parse("http://morning"));
                } else if (time >= 14 && time < 16) {
                    intent.setData(Uri.parse("http://afternoon"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }

}