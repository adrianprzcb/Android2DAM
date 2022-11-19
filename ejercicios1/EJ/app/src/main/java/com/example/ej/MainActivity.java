package com.example.ej;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    ConstraintLayout vista;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        vista = findViewById(R.id.vista);
        //  Intent intent = new Intent(this ,MainActivity2.class);
        vista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = (view.getId());
                Toast.makeText(MainActivity.this,"" + id, Toast.LENGTH_SHORT).show();
                if(tv1.callOnClick()){
                    Toast.makeText(MainActivity.this, "VUAMOS", Toast.LENGTH_SHORT).show();
                }
            }
        });




      /*  tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  intent.putExtra("nm" , "Texto 1");
                //  startActivity(intent);
               // Toast.makeText(MainActivity.this, "TEXTO 1", Toast.LENGTH_SHORT).show();

            }
        });*/

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  intent.putExtra("nm" , "Texto 2");
                // startActivity(intent);

                Toast.makeText(MainActivity.this, "TEXTO 2", Toast.LENGTH_SHORT).show();

            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  intent.putExtra("nm" , "Texto 3");

                //  startActivity(intent);

                Toast.makeText(MainActivity.this, "TEXTO 3", Toast.LENGTH_SHORT).show();

            }
        });


    }
}



