package com.example.ej4intentsexplicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton1, boton2, boton3, boton4;
    TextView num1, num2, num3, num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);


        boton1.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondaryActivity.class);
            intent.putExtra("numero", num1.getText().toString());
            startActivity(intent);
            num1.setText(String.valueOf(Integer.parseInt(num1.getText().toString()) + 1));
        });

        boton2.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondaryActivity.class);
            intent.putExtra("numero", num2.getText().toString());
            startActivity(intent);
            num2.setText(String.valueOf(Integer.parseInt(num2.getText().toString()) + 1));

        });

        boton3.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondaryActivity.class);
            intent.putExtra("numero", num3.getText().toString());
            startActivity(intent);
            num3.setText(String.valueOf(Integer.parseInt(num3.getText().toString()) + 1));

        });

        boton4.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondaryActivity.class);
            intent.putExtra("numero", num4.getText().toString());
            startActivity(intent);
            num4.setText(String.valueOf(Integer.parseInt(num4.getText().toString()) + 1));

        });








    }

}