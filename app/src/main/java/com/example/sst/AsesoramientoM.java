package com.example.sst;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AsesoramientoM extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;

    Button btnSeleccionarImagen, btnSubirAses;
    EditText edtTitulos, edtDescripcion, etBuscar;
    TextView tvTitulo;
    ImageView ivPreview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSeleccionarImagen = findViewById(R.id.btnSeleccionarImagen);
        btnSubirAses = findViewById(R.id.btnSubirAses);
        edtTitulos = findViewById(R.id.edtTitulos);
        edtDescripcion = findViewById(R.id.edtDescripcion);
        etBuscar = findViewById(R.id.etBuscar);
        tvTitulo = findViewById(R.id.tvTitulo);
        ivPreview = new ImageView(this);

        btnSeleccionarImagen.setOnClickListener(v -> openImagePicker());

        btnSubirAses.setOnClickListener(v -> {
            String titulo = edtTitulos.getText().toString().trim();
            String descripcion = edtDescripcion.getText().toString().trim();

            if (titulo.isEmpty() || descripcion.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Asesoramiento subido con éxito", Toast.LENGTH_SHORT).show();
                // Aquí iría tu lógica de subida a la base de datos o servidor
            }
        });
    }

    private void openImagePicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent, "Selecciona una imagen"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            Uri imageUri = data.getData();
            Toast.makeText(this, "Imagen seleccionada correctamente", Toast.LENGTH_SHORT).show();

        }
    }
}