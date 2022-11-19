package com.example.llamadaentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    TextView texto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton);
        texto1 = findViewById(R.id.texto);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Selecciona.class);
                startActivity(intent);



            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        String provincia = intent.getStringExtra("provincia");
        if(provincia != null){
            texto1.setText(provincia);
        }
    }


}