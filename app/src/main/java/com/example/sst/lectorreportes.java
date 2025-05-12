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

public class lectorreportes extends AppCompatActivity {
    private ImageView iv_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lectorreportes);
        iv_Logo = findViewById(R.id.iv_logo); // Asumiendo que el ID es img_logo

        // Configura el listener para la imagen
        iv_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer clic en la imagen, se abre OtraActividad
                Intent intent = new Intent(lectorreportes.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}