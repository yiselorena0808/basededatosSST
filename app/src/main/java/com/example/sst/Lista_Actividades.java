package com.example.sst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sst.databinding.ActivityLectorActividadesBinding;
import com.example.sst.databinding.ActivityListaActividadesBinding;

public class Lista_Actividades extends AppCompatActivity {

    ActivityListaActividadesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_actividades);

        binding = ActivityListaActividadesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lista_Actividades.this, Lector_Actividades.class));
            }
        });

        binding.btndetalles1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lista_Actividades.this, Lector_Actividades.class));
            }
        });

    }
}