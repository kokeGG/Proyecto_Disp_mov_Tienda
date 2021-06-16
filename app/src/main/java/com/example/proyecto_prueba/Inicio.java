package com.example.proyecto_prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    Button btnRegProd, btnvisualizarProd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        inicializaComponentes();
        cargarDatos();
    }

    private void cargarDatos() {
        btnRegProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),registrarProductos.class);
                startActivity(intent);
            }
        });

            btnvisualizarProd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Inicio.this, "CSM LA APP \nA MIMIR", Toast.LENGTH_LONG).show();
                    Intent in = new Intent(getApplicationContext(),visualizarProducto.class);
                    startActivity(in);
                }
            });







    }

    private void inicializaComponentes() {

        btnRegProd = findViewById(R.id.btnRegProd);
        btnvisualizarProd = findViewById(R.id.btnVisProd);
    }
}