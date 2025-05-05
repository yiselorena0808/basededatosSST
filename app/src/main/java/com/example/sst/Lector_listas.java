package com.example.sst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sst.Controller.ListaChequeo;
import com.example.sst.databinding.ActivityLectorGestionBinding;
import com.example.sst.databinding.ActivityLectorListasBinding;

public class Lector_listas extends AppCompatActivity {

    ActivityLectorListasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lector_listas);

        binding = ActivityLectorListasBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imgButtonCrear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lector_listas.this, ListaChequeo.class));
            }
        });

        binding.btndetallesListaChequeo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lector_listas.this, ListaChequeo.class));
            }
        });

    }
}