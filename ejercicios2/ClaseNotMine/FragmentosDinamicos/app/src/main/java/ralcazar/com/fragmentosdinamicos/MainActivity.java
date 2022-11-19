package ralcazar.com.fragmentosdinamicos;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    boolean cargarFragmento2 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            //Modifica el fragmento cargado
            public void onClick(View view) {
                    // Modificar el Fragmento que sale en la pantalla dentro del container
                Fragment f = null;
                if(cargarFragmento2) {
                    f = new SegundoFregmento();
                } else {
                    f = new PrimerFragmento();
                }
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, f)
                        .commit();

                cargarFragmento2 = !cargarFragmento2;

            }
        });
        getSupportFragmentManager()// Rescatamos el contenedor y le vamos a cargar un fragmento
                .beginTransaction()//para comenzar la transacción
                .add(R.id.container, new PrimerFragmento())//añadimos, ya que está vacio, un fragmento
                .commit();//y ejecuta
    }


}
/*
*
* */