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
import com.example.sst.databinding.ActivityBlog1Binding;
import com.example.sst.databinding.ActivityRegistroNuevoBinding;

public class Blog1 extends AppCompatActivity {

    ActivityBlog1Binding binding;
    private ImageView iv_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_blog1);

        binding = ActivityBlog1Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        iv_Logo = findViewById(R.id.iv_logo); // Asumiendo que el ID es img_logo
        // Configura el listener para la imagen
        iv_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer clic en la imagen, se abre OtraActividad
                Intent intent = new Intent(Blog1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.btnCrear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Blog1.this, Blog2.class));
            }
        });

    }
}