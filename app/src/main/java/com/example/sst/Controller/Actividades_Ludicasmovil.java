package com.example.sst.Controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.Lector_Actividades;
import com.example.sst.Lista_Actividades;
import com.example.sst.databinding.ActivityActividadesLudicasmovilBinding;

import com.example.sst.R;
import com.example.sst.databinding.ActivityBlog2Binding;

public class Actividades_Ludicasmovil extends AppCompatActivity {

    ActivityActividadesLudicasmovilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_epp);

        binding = ActivityActividadesLudicasmovilBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnEnviarEvidencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Actividades_Ludicasmovil.this, Lista_Actividades.class));
            }
        });

    }

}