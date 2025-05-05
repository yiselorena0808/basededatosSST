package com.example.sst.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sst.Lector_listas;
import com.example.sst.Reportes_Usuarioss;
import com.example.sst.databinding.ActivityListaChequeoBinding;

import com.example.sst.R;

public class ListaChequeo extends AppCompatActivity {

    ActivityListaChequeoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_chequeo);

        binding = ActivityListaChequeoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaChequeo.this, Lector_listas.class));
            }
        });

    }
}