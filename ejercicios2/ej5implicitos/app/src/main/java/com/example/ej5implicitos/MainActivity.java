package com.example.ej5implicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnDial, btnWebSearch , btnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = findViewById(R.id.btnDial);
        btnWebSearch = findViewById(R.id.btnWebSearch);
        btnView = findViewById(R.id.btnView);


        btnDial.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:112"));

            if (intent.resolveActivity(getPackageManager()) != null) {
            }
            startActivity(intent);
        });

            //Contact List Activity
        btnView.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("content://contacts/people/"));

            if (intent.resolveActivity(getPackageManager()) != null) {
            }
            startActivity(intent);
        });


        btnWebSearch.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra("query", "Android");

            if (intent.resolveActivity(getPackageManager()) != null) {
            }
            startActivity(intent);
        });

    }
}