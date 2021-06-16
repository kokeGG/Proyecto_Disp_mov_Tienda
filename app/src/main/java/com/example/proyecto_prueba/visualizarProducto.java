package com.example.proyecto_prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyecto_prueba.entidades.Productos;

import java.util.ArrayList;

public class visualizarProducto extends AppCompatActivity {
    RecyclerView listaProd;
    ArrayList<Productos> listArrayProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_producto);

        inicializarComponentes();
        cargarDatos();
    }

    private void cargarDatos() {
        listaProd.setLayoutManager(new LinearLayoutManager(this));
        DbProductos dbProductos = new DbProductos(visualizarProducto.this);
        listArrayProd = new ArrayList<>();
        listaProductosAdapter adapter = new listaProductosAdapter(dbProductos.mostrarProductos());
        listaProd.setAdapter(adapter);
    }

    private void inicializarComponentes() {
        listaProd = findViewById(R.id.listaProductos);

    }
}