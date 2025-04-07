package com.example.sst.Controller;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sst.Model.DBHelper;
import com.example.sst.R;

public class MainActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    private EditText etIdGestion, etIdUsuario, etIdUsuario2, etNombre, etApellido, etCedula, etCargo, etProducto, etCantidad, etEstado, etImportancia;
    private Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new DBHelper(this);

        etIdGestion = findViewById(R.id.et_id_gestion);
        etIdUsuario = findViewById(R.id.et_id_usuario);
        etIdUsuario2 = findViewById(R.id.et_id_usuario2);
        etNombre = findViewById(R.id.et_nombre);
        etApellido = findViewById(R.id.et_apellido);
        etCedula = findViewById(R.id.et_cedula);
        etCargo = findViewById(R.id.et_cargo);
        etProducto = findViewById(R.id.et_producto);
        etCantidad = findViewById(R.id.et_cantidad);
        etEstado = findViewById(R.id.et_estado);
        etImportancia = findViewById(R.id.et_importancia);

        btnGuardar = findViewById(R.id.btn_guardar);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarDatos();
            }
        });
    }

    private void guardarDatos() {
        String idGestion = etIdGestion.getText().toString();
        String idUsuario = etIdUsuario.getText().toString();
        String idUsuario2 = etIdUsuario2.getText().toString();
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        String cedula = etCedula.getText().toString();
        String cargo = etCargo.getText().toString();
        String producto = etProducto.getText().toString();
        String cantidad = etCantidad.getText().toString();
        String estado = etEstado.getText().toString();
        String importancia = etImportancia.getText().toString();

        SQLiteDatabase bd= dbHelper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("id_gestion", idGestion);
        values.put("id_usuario", idUsuario);
        values.put("id_usuario2", idUsuario2);
        values.put("nombre", nombre);
        values.put("apellido", apellido);
        values.put("cedula", cedula);
        values.put("cargo", cargo);
        values.put("producto", producto);
        values.put("cantidad", cantidad);
        values.put("estado", estado);
        values.put("importancia", importancia);
        bd.insert("gestion_equipos", null, values);
        bd.close();

        Toast.makeText(this,"Datos guardados correctamente",Toast.LENGTH_SHORT).show();
    }
}
