package com.example.sst;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AsesoramientoM extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;

    private Button btnSeleccionarImagen, btnSubirAses;
    private EditText edtTitulo, edtDescripcion, etBuscar;
    private TextView tvTitulo;
    private ImageView ivPreview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSeleccionarImagen = findViewById(R.id.btnSubirImagen);
        btnSubirAses = findViewById(R.id.btnSubirAses);
        edtTitulo = findViewById(R.id.edtTitulo);  //
        edtDescripcion = findViewById(R.id.edtDescripcion);
        etBuscar = findViewById(R.id.etBuscar);
        tvTitulo = findViewById(R.id.tvTitulo);


        ivPreview = new ImageView(this);
        ((LinearLayout) findViewById(android.R.id.content)).addView(ivPreview);

        // Seleccionar imagen
        btnSeleccionarImagen.setOnClickListener(v -> openImagePicker());

        // Subir asesoramiento
        btnSubirAses.setOnClickListener(v -> {
            String titulo = edtTitulo.getText().toString().trim();
            String descripcion = edtDescripcion.getText().toString().trim();

            if (titulo.isEmpty() || descripcion.isEmpty()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Asesoramiento subido con éxito", Toast.LENGTH_SHORT).show();

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

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.getData() != null) {
            Uri imageUri = data.getData();
            ivPreview.setImageURI(imageUri); // Vista previa
            Toast.makeText(this, "Imagen seleccionada correctamente", Toast.LENGTH_SHORT).show();
        }
    }
}
