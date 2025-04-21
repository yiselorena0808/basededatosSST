package com.example.sst.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.example.sst.R;
import com.example.sst.ReportesRecibidos;

public class MainActivity extends AppCompatActivity {
    Button btnGestionEpp, btnReportes, btnActividades, btnLista, btnBlog, btnAsesoramiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGestionEpp = findViewById(R.id.btn_GestionEpp);
        btnReportes = findViewById(R.id.btn_Reportes);
        btnActividades = findViewById(R.id.btn_Act);
        btnLista = findViewById(R.id.btn_Lista);
        btnBlog = findViewById(R.id.btn_Blog);
        btnAsesoramiento = findViewById(R.id.btn_Asesoramiento);

        btnGestionEpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GestionEpp.class));
            }
        });

        btnReportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ReportesRecibidos.class));
            }
        });

        btnActividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Actividades_Ludicasmovil.class));
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListaChequeo.class));
            }
        });

        btnBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Blog.class));
            }
        });
    }
}
