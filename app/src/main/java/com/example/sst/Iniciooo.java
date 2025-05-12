package com.example.sst;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.sst.Model.ManagerDb;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Iniciooo extends AppCompatActivity {

    private EditText etCorreo, etPassword;
    private Button btnLogin;
    private ManagerDb managerDB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCorreo = findViewById(R.id.etCorreo);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        managerDB = new ManagerDb(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etCorreo.getText().toString();
                String password = etPassword.getText().toString();

                // Validar los campos
                if (!email.isEmpty() && !password.isEmpty()) {
                    // Guardar en la base de datos
                    managerDB.addUser(email, password);
                    Toast.makeText(Iniciooo.this, "Usuario guardado correctamente", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Iniciooo.this, "Por favor, complete los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
