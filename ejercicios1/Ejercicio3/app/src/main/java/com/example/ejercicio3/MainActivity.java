package com.example.ejercicio3;

import static com.example.ejercicio3.R.color.red;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    RadioGroup grupo1;
    RadioGroup grupo2;
    RadioButton  fondoNegro , fondoVerde, fondoRojo, textoBlanco , textoAmarillo , textoAzul ;
    CheckBox  checkMostrarTexto;
    ConstraintLayout vista;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto);
        grupo1 = findViewById(R.id.radioGroup);
        grupo2 = findViewById(R.id.radioGroup2);
       fondoNegro = findViewById(R.id.fondoNegro);
        fondoVerde= findViewById(R.id.fondoVerde);
        fondoRojo= findViewById(R.id.fondoRojjo);
        textoBlanco= findViewById(R.id.textoBlanco);
        textoAmarillo = findViewById(R.id.textoAmarillo);
        textoAzul= findViewById(R.id.textoAzul);
        checkMostrarTexto = findViewById(R.id.checkBox);
        vista = findViewById(R.id.vista);


        checkMostrarTexto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkMostrarTexto.isChecked()){
                    texto.setVisibility(View.VISIBLE);
                }else{
                    texto.setVisibility(View.INVISIBLE);
                }
            }
        });

    }


    @SuppressLint("ResourceAsColor")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.fondoNegro:
                if (checked)
                    vista.setBackgroundResource(androidx.cardview.R.color.cardview_dark_background);
                    break;
            case R.id.fondoRojjo:
                if (checked)
                   vista.setBackgroundResource(red);
                break;
            case R.id.fondoVerde:
                if (checked)
                    vista.setBackgroundResource(R.color.green);
                break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.textoAmarillo:
                if (checked)
                    texto.setTextColor(getResources().getColor(R.color.yellow));
                break;
            case R.id.textoAzul:
                if (checked)
                    texto.setTextColor(getResources().getColor(R.color.blue));
                break;
            case R.id.textoBlanco:
                if (checked)
                    texto.setTextColor(getResources().getColor(R.color.white));
                break;
        }
    }





}