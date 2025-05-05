package com.example.sst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.sst.databinding.ActivityLectorReporrrtesBinding;
import com.example.sst.databinding.ActivityMainBinding;

public class Lector_Reporrrtes extends AppCompatActivity {

    ActivityLectorReporrrtesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lector_reporrrtes);

        binding = ActivityLectorReporrrtesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.imgButtonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLectorReporrrtesBinding.this, interfaz.class));
            }
        });

    }
}