package com.example.sst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.sst.Controller.MainActivity;
import com.example.sst.databinding.ActivityCrearreportesBinding;
import com.example.sst.databinding.ActivityLectorReporrrtesBinding;

public class Crearreportes extends AppCompatActivity {

    ActivityCrearreportesBinding binding;
    private ImageView iv_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_crearreportes);

        binding = ActivityCrearreportesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnregresarGestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Crearreportes.this, Lector_Reporrrtes.class));
            }
        });
        iv_Logo = findViewById(R.id.iv_logo); // Asumiendo que el ID es img_logo
        // Configura el listener para la imagen
        iv_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer clic en la imagen, se abre OtraActividad
                Intent intent = new Intent(Crearreportes.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}