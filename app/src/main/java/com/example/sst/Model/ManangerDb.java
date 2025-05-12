package com.example.sst.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.sst.Controller.DBHelper;

public class ManangerDb {

    DBHelper dbHelper;

    SQLiteDatabase db;

    public ManangerDb (Context context) {
        dbHelper = new DBHelper(context);
    }

    public void openDbwrite() {
        db = dbHelper.getWritableDatabase();
    }

    public void openDbRd() {
        db = dbHelper.getReadableDatabase();
    }

    public long insertData() {
        openDbwrite();

        ContentValues valores = new ContentValues();

         valores.put("nombre", "Laura Pérez");
         valores.put("cedula", "1023456789");
         valores.put("cargo", "Analista de Datos");
         valores.put("lugar", "Bogotá");
         valores.put("descripcion", "Encargada de la recolección y análisis de datos del área de marketing.");
         valores.put("estado", "Activo");

         long resul = db.insert ("Datos", null, valores);
         return resul;

    }

}