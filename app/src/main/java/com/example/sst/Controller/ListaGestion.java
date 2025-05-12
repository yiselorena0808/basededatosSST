package com.example.sst.Controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.Lector_Gestion;
import com.example.sst.databinding.ListaGestionBinding;

import com.example.sst.R;

public class ListaGestion extends AppCompatActivity {

         ListaGestionBinding binding;
         private ImageView iv_Logo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lista_gestion);

        binding = ListaGestionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        iv_Logo = findViewById(R.id.iv_logo); // Asumiendo que el ID es img_logo

        // Configura el listener para la imagen
        iv_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer clic en la imagen, se abre OtraActividad
                Intent intent = new Intent(ListaGestion.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaGestion.this, GestionEpp.class));
            }
        });

        binding.btndetalles1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaGestion.this, Lector_Gestion.class));
            }
        });

    }
}