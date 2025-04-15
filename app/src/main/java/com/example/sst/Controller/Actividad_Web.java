package com.example.sst.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.R;

public class Actividad_Web extends AppCompatActivity {

    EditText etUsuario, etNombreActividad, etFecha, etDescripcion;
    Button btnSubirImagenVideo, btnSubirArchivo, btnEnviarEvidencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etUsuario = findViewById(R.id.etUsuario);
        etNombreActividad = findViewById(R.id.etNombreActividad);
        etFecha = findViewById(R.id.etFecha);
        etDescripcion = findViewById(R.id.etDescripcion);

        btnSubirImagenVideo = findViewById(R.id.btnSubirImagenVideo);
        btnSubirArchivo = findViewById(R.id.btnSubirArchivo);
        btnEnviarEvidencias = findViewById(R.id.btnEnviarEvidencias);

        btnSubirImagenVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Actividad_Web.this, "Subir imagen o video", Toast.LENGTH_SHORT).show();

            }
        });

        btnSubirArchivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Actividad_Web.this, "Subir archivo", Toast.LENGTH_SHORT).show();

            }
        });

        btnEnviarEvidencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = etUsuario.getText().toString();
                String nombreActividad = etNombreActividad.getText().toString();
                String fecha = etFecha.getText().toString();
                String descripcion = etDescripcion.getText().toString();

                Toast.makeText(Actividad_Web.this,
                        "Enviando evidencia:\n" +
                                "Usuario: " + usuario + "\n" +
                                "Actividad: " + nombreActividad + "\n" +
                                "Fecha: " + fecha + "\n" +
                                "Descripción: " + descripcion,
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}