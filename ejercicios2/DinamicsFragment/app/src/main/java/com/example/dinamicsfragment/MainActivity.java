package com.example.dinamicsfragment;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.dinamicsfragment.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    boolean cargarFragmento2 = true;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cargarFragmento2) {
                    getSupportFragmentManager().
                            beginTransaction().
                            replace(R.id.contenedor, new SecondFragment()).
                            commit();
                }else{
                    getSupportFragmentManager().
                            beginTransaction().
                            add(R.id.contenedor, new FirstFragment()).
                            commit();
                }
                cargarFragmento2=!cargarFragmento2;
            }

        });


    }


}