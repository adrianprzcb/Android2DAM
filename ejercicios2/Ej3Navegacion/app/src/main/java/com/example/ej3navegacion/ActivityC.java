package com.example.ej3navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {


    Button btnCA, btnCB, btnCD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);


        btnCA = findViewById(R.id.btnCA);
        btnCB = findViewById(R.id.btnCB);
        btnCD = findViewById(R.id.btnCD);


        btnCA .setOnClickListener(v -> {
            finish();
        });

        btnCB.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
            finish();
        });

        btnCD.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityD.class);
            startActivity(intent);
            finish();
        });



    }
}