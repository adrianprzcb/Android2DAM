package com.example.ej3navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    Button btnAB, btnAC, btnAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        btnAB = findViewById(R.id.btnAB);
        btnAC = findViewById(R.id.btnAC);
        btnAD = findViewById(R.id.btnAD);

        Toast.makeText(this, "CREADA", Toast.LENGTH_SHORT).show();

        btnAB.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
        });

        btnAC.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityC.class);
            startActivity(intent);
        });

        btnAD.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityD.class);
            startActivity(intent);
        });

    }
}