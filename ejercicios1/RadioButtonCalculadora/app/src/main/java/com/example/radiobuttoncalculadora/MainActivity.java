package com.example.radiobuttoncalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText num1, num2;
    RadioGroup operacion;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResultado = findViewById(R.id.resultado);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        operacion = findViewById(R.id.operacion);
        btnCalcular = findViewById(R.id.boton);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int operacionSeleccionada = operacion.getCheckedRadioButtonId();
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int resultado = 0;

                if (operacionSeleccionada == R.id.sumar) {
                    resultado = numero1 + numero2;
                } else if (operacionSeleccionada == R.id.restar) {
                    resultado = numero1 - numero2;
                } else if (operacionSeleccionada == R.id.mult) {
                    resultado = numero1 * numero2;
                } else if (operacionSeleccionada == R.id.div) {
                    resultado = numero1 / numero2;
                }
                txtResultado.setText(String.valueOf(resultado));
            }
        });

    }
}