package com.example.llamadaentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Selecciona extends AppCompatActivity {

    ListView listView;

    private String provinciasAndaluzas[] = {"Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciona);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listviewlayout, provinciasAndaluzas);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String provincia = listView.getItemAtPosition(i).toString();
                ir(provincia);
            }
        });
    }

    private void ir(String provincia) {
        Intent intent = new Intent(Selecciona.this, MainActivity.class);
        intent.putExtra("provincia", provincia);
        startActivity(intent);
    }

}