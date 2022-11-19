package com.example.ej3navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {


    Button btnBA, btnBC, btnBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        btnBA = findViewById(R.id.btnBA);
        btnBC = findViewById(R.id.btnBC);
        btnBD = findViewById(R.id.btnBD);


        btnBA.setOnClickListener(v -> {
            finish();
        });

        btnBC.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityC.class);
            startActivity(intent);
            finish();
        });

        btnBD.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityD.class);
            startActivity(intent);
            finish();
        });
    }
}