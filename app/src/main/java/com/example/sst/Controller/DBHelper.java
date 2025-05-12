package com.example.sst.Controller;
import static com.example.sst.Model.Constantes.DB_NAME;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.sst.Model.Constantes;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context) {
        super (context, Constantes.DB_NAME, null, Constantes.DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constantes.GESTION_EPP);
        db.execSQL(Constantes.BLOG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("Drop table if exists gestiones");
        db.execSQL("Drop table if exists CrearBlog");
        onCreate(db);

    }
}
