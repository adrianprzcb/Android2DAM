package com.example.ej3navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityD extends AppCompatActivity {

    Button btnDA, btnDB, btnDC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        btnDA = findViewById(R.id.btnDA);
        btnDB = findViewById(R.id.btnDB);
        btnDC = findViewById(R.id.btnDC);

        btnDA.setOnClickListener(v -> {
            finish();
        });

        btnDB.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
            finish();
        });

        btnDC.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityC.class);
            startActivity(intent);
            finish();
        });
    }
}