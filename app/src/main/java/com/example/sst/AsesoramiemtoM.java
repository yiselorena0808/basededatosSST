package com.example.sst;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editTitulo, editDescripcion;
    Button btnSeleccionarImagenes, btnGuardar;
    TextView textCantidadImagenes;
    ListView listaAsesoramientos;

    ArrayList<Uri> imagenesSeleccionadas = new ArrayList<>();
    ArrayList<Asesoramiento> lista = new ArrayList<>();
    AsesoramientoAdapter adapter;

    final int REQUEST_IMAGENES = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTitulo = findViewById(R.id.editTitulo);
        editDescripcion = findViewById(R.id.editDescripcion);
        btnSeleccionarImagenes = findViewById(R.id.btnSeleccionarImagenes);
        btnGuardar = findViewById(R.id.btnGuardar);
        textCantidadImagenes = findViewById(R.id.textCantidadImagenes);
        listaAsesoramientos = findViewById(R.id.listaAsesoramientos);

        adapter = new AsesoramientoAdapter(this, lista);
        listaAsesoramientos.setAdapter(adapter);

        btnSeleccionarImagenes.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
            intent.setType("image/*");
            startActivityForResult(Intent.createChooser(intent, "Seleccione imágenes"), REQUEST_IMAGENES);
        });

        btnGuardar.setOnClickListener(v -> {
            String titulo = editTitulo.getText().toString();
            String descripcion = editDescripcion.getText().toString();
            if (!titulo.isEmpty() && !descripcion.isEmpty()) {
                lista.add(new Asesoramiento(titulo, descripcion, new ArrayList<>(imagenesSeleccionadas)));
                adapter.notifyDataSetChanged();
                editTitulo.setText("");
                editDescripcion.setText("");
                imagenesSeleccionadas.clear();
                textCantidadImagenes.setText("0/5 imágenes seleccionadas");
            } else {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGENES && resultCode == RESULT_OK && data != null) {
            imagenesSeleccionadas.clear();
            if (data.getClipData() != null) {
                int count = Math.min(data.getClipData().getItemCount(), 5);
                for (int i = 0; i < count; i++) {
                    imagenesSeleccionadas.add(data.getClipData().getItemAt(i).getUri());
                }
            } else if (data.getData() != null) {
                imagenesSeleccionadas.add(data.getData());
            }
            textCantidadImagenes.setText(imagenesSeleccionadas.size() + "/5 imágenes seleccionadas");
        }
    }
}
