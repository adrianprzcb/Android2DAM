package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView fibo;
    Button btnCalcular;
    int n1 = 1;
    int n2 = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fibo = findViewById(R.id.fibo);
        btnCalcular = findViewById(R.id.btnCalcular);



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //fibonacci appending text
                int res = n1 + n2;
                fibo.append(" - " + res);
                n1 = n2;
                n2 = res;
            }
        });
    }
}