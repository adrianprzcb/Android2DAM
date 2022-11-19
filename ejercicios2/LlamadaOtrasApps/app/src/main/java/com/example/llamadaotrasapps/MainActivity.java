package com.example.llamadaotrasapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView url, mail, latitud, longitud;
    String web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = findViewById(R.id.url);
        mail = findViewById(R.id.mail);
        latitud = findViewById(R.id.latitud);
        longitud = findViewById(R.id.longitud);
    }


    public void irWeb(View view) {
         web = url.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://"+web));
        startActivity(intent);
    }




    public void sendMail(View view) {
        String[] email ={mail.getText().toString()};

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, email);

        startActivity(intent);

    }

    public void goToMap(View view){
        String lat = latitud.getText().toString();
        String lon = longitud.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lon));
        startActivity(intent);
    }









}