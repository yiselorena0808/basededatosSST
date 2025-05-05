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
import com.example.sst.databinding.ActivityCrearchequeoBinding;
import com.example.sst.databinding.ActivityLectorReporrrtesBinding;

public class crearchequeo extends AppCompatActivity {

    ActivityCrearchequeoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_crearchequeo);

        binding = ActivityCrearchequeoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnChequeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(crearchequeo.this, ListaChequeo.class));
            }
        });

    }
}