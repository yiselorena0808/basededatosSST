package com.example.sst.Controller;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sst.Model.DBHelper;
import com.example.sst.R;

public class GestionEpp extends AppCompatActivity {
    private DBHelper dbHelper;
    private EditText  etNombre,etCedula,etCargo,etLugar,etdescripcion,etfecha;
    private Spinner sp_importancia;
    private Button btnGuardar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gestion_epp);
        dbHelper = new DBHelper(this);
        etNombre = findViewById(R.id.et_nombre);
        etCedula = findViewById(R.id.et_cedula);
        etCargo = findViewById(R.id.et_cargo);
        etdescripcion= findViewById(R.id.et_descripcion);
        etLugar= findViewById(R.id.et_lugar);

        sp_importancia= findViewById(R.id.sp_importancia);
        ArrayAdapter<CharSequence> adapterImportancia = ArrayAdapter.createFromResource(this, R.array.importancias, android.R.layout.simple_spinner_item);
        adapterImportancia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_importancia.setAdapter(adapterImportancia);


    }

    private void guardarDatos() {
        String nombre = etNombre.getText().toString();
        String cedula = etCedula.getText().toString();
        String cargo = etCargo.getText().toString();

        SQLiteDatabase bd= dbHelper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("nombre", nombre);
        values.put("cedula", cedula);
        values.put("cargo", cargo);
        values.put("estado", estado);
        values.put("importancia", importancia);
        bd.insert("gestion_equipos", null, values);
        bd.close();

        Toast.makeText(this,"Datos guardados correctamente",Toast.LENGTH_SHORT).show();
    }
}
