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
import com.example.sst.databinding.ActivityBlog2Binding;

public class Blog2 extends AppCompatActivity {

    ActivityBlog2Binding binding;
    private ImageView iv_Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_blog2);

        binding = ActivityBlog2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        iv_Logo = findViewById(R.id.iv_logo); // Asumiendo que el ID es img_logo
        // Configura el listener para la imagen
        iv_Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Al hacer clic en la imagen, se abre OtraActividad
                Intent intent = new Intent(Blog2.this, MainActivity.class);
                startActivity(intent);
            }
        });


        binding.btnPubli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Blog2.this, Blog1.class));
            }
        });

        binding.btnRegreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Blog2.this, Blog1.class));
            }
        });

    }
}