package com.example.sst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.sst.databinding.ActivityReportesUsuariossBinding;

public class Reportes_Usuarioss extends AppCompatActivity {

    ActivityReportesUsuariossBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reportes_usuarioss);

        binding = ActivityReportesUsuariossBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btndetallesReportes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reportes_Usuarioss.this, Lector_Reporrrtes.class));
            }
         });

        binding.imgButtonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Reportes_Usuarioss.this, ReportesRecibidos.class));
            }
        });

    }
}