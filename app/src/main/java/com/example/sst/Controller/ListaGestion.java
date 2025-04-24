package com.example.sst.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.Lector_Gestion;
import com.example.sst.databinding.ListaGestionBinding;

import com.example.sst.R;

public class ListaGestion extends AppCompatActivity {

         ListaGestionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lista_gestion);

        binding = ListaGestionBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

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