package com.example.ej4intentsexplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView textView;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Intent intent = getIntent();
        String num = intent.getStringExtra("numero") ;
        boton = findViewById(R.id.boton);
        textView = findViewById(R.id.textView);

        int numero = Integer.parseInt(num) + 1;
        String neo = String.valueOf(numero);
        textView.setText(neo);

     boton.setOnClickListener(view -> {
            finish();
                  });
    }
}