package com.example.sst.Model;

public class Constantes {

    // Nombre de la base de datos
    public static final String DATABASE_NAME = "usuarios.db";
    public static final int DATABASE_VERSION = 1;

    // Nombre de la tabla
    public static final String TABLE_USERS = "users";

    // Nombres de las columnas
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";

    // Sentencia SQL para crear la tabla
    public static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_USERS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_EMAIL + " TEXT, " +
                    COLUMN_PASSWORD + " TEXT);";
}


