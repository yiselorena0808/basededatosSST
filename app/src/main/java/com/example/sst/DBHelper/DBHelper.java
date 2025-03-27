package com.example.sst.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "gestion_equipos.db";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE gestion_equipos (" +
                "id_gestion INTEGER PRIMARY KEY, " +
                "id_usuario INTEGER, " +
                "id_usuario2 INTEGER, " +
                "nombre TEXT, " +
                "apellido TEXT, " +
                "cedula TEXT, " +
                "cargo TEXT, " +
                "producto TEXT, " +
                "cantidad INTEGER, " +
                "estado TEXT, " +
                "importancia TEXT" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS gestion_equipos");
        onCreate(db);
    }
}

