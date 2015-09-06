package com.androidexample.mvc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB  extends SQLiteOpenHelper {

    //Query para crear las tablas en la bd
    String query="CREATE TABLE user (userid INTEGER PRIMARY KEY AUTOINCREMENT, paizoID TEXT)";

    //Constructor de la clase
    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Ejecuta query para crear la tabla
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        db.execSQL("DROP TABLE IF EXISTS personas");
        db.execSQL(query);
    }

}