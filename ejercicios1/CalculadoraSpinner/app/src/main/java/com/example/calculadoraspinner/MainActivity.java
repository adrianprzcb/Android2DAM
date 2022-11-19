package com.example.calculadoraspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText num1, num2;
    Spinner operacion;
    Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    txtResultado = findViewById(R.id.resultado);
    num1 = findViewById(R.id.num1);
    num2 = findViewById(R.id.num2);
    operacion = findViewById(R.id.spinner);
    btnCalcular = findViewById(R.id.boton);




        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String operacionSeleccionada = operacion.getSelectedItem().toString();
                int numero1 = Integer.parseInt(num1.getText().toString());
                int numero2 = Integer.parseInt(num2.getText().toString());
                int resultado = 0;

                if (operacionSeleccionada.equals("+")) {
                    resultado = numero1 + numero2;
                } else if (operacionSeleccionada.equals("-")) {
                    resultado = numero1 - numero2;
                } else if (operacionSeleccionada.equals("*")) {
                    resultado = numero1 * numero2;
                } else if (operacionSeleccionada.equals("/")) {
                    resultado = numero1 / numero2;
                }
                txtResultado.setText(String.valueOf(resultado));
            }
        });




    }
}