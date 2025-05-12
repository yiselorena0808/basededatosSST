package com.example.sst.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.sst.Controller.DBHelper;

public class ManagerDb {

    private DBHelper dbHelper;

    public ManagerDb(Context context) {
        dbHelper = new DBHelper(context);
    }

    // Método para agregar un nuevo usuario
    public void addUser(String email, String password) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Constantes.COLUMN_EMAIL, email);
        values.put(Constantes.COLUMN_PASSWORD, password);

        // Insertar los valores en la base de datos
        db.insert(Constantes.TABLE_USERS, null, values);
        db.close();
    }

    // Aquí podrías agregar otros métodos como leer, actualizar o eliminar usuarios.
}
