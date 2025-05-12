package com.example.sst;

import android.annotation.SuppressLint;
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
import com.example.sst.databinding.ActivityLectorReporrrtesBinding;
import com.example.sst.databinding.ActivityMainBinding;

public class Lector_Reporrrtes extends AppCompatActivity {

    ActivityLectorReporrrtesBinding binding;
    private ImageView iv_Logo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lector_reporrrtes);
        iv_Logo = findViewById(R.id.iv_logo); // Asumiendo que el ID es img_logo

        // Configura el listener para la imagen
        iv_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer clic en la imagen, se abre OtraActividad
                Intent intent = new Intent(Lector_Reporrrtes.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding = ActivityLectorReporrrtesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imgButtonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Lector_Reporrrtes.this, Crearreportes.class));
            }
        });

    }
}