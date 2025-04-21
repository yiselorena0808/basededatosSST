package com.example.sst.Controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.R;

public class Actividades_Ludicasmovil extends AppCompatActivity {

    EditText etUsuario, etNombreActividad, etFecha, etDescripcion;
    Button btnSubirImagen, btnSubirVideo, btnSubirEvidencia;

    private static final int PICK_IMAGE_REQUEST = 1;
    private static final int PICK_VIDEO_REQUEST = 2;

    Uri imagenUri = null;
    Uri videoUri = null;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_epp);


        etUsuario = findViewById(R.id.etUsuario);
        etNombreActividad = findViewById(R.id.etNombreActividad);
        etFecha = findViewById(R.id.etFecha);
        etDescripcion = findViewById(R.id.etDescripcion);
        btnSubirImagen = findViewById(R.id.btnSubirImagen);
        btnSubirVideo = findViewById(R.id.btnSubirVideo);
        btnSubirEvidencia = findViewById(R.id.btnEnviarEvidencia);


        btnSubirImagen.setOnClickListener(v -> openFileChooser(PICK_IMAGE_REQUEST));


        btnSubirVideo.setOnClickListener(v -> openFileChooser(PICK_VIDEO_REQUEST));


        btnSubirEvidencia.setOnClickListener(v -> subirEvidencia());
    }

    private void openFileChooser(int tipoArchivo) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType(tipoArchivo == PICK_IMAGE_REQUEST ? "image/*" : "video/*");
        startActivityForResult(Intent.createChooser(intent, "Selecciona archivo"), tipoArchivo);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && data != null && data.getData() != null) {
            Uri uriSeleccionado = data.getData();

            if (requestCode == PICK_IMAGE_REQUEST) {
                imagenUri = uriSeleccionado;
                Toast.makeText(this, "Imagen seleccionada", Toast.LENGTH_SHORT).show();
            } else if (requestCode == PICK_VIDEO_REQUEST) {
                videoUri = uriSeleccionado;
                Toast.makeText(this, "Video seleccionado", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void subirEvidencia() {
        String usuario = etUsuario.getText().toString().trim();
        String actividad = etNombreActividad.getText().toString().trim();
        String fecha = etFecha.getText().toString().trim();
        String descripcion = etDescripcion.getText().toString().trim();

        if (usuario.isEmpty() || actividad.isEmpty() || fecha.isEmpty() || descripcion.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        if (imagenUri == null && videoUri == null) {
            Toast.makeText(this, "Selecciona al menos una imagen o un video", Toast.LENGTH_SHORT).show();
            return;
        }


        Toast.makeText(this, "Evidencia subida exitosamente", Toast.LENGTH_LONG).show();
    }
}