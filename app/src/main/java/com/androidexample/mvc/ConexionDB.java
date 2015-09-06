package com.androidexample.mvc;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ConexionDB {
    private SQLiteDatabase db;
    private Context nContext;
    private DB objBD;


    public ConexionDB(Context c){
        nContext=c;
    }

    public void abrirConexion(){
        objBD =new DB(nContext,"BDpfs",null,1 );
        db=objBD.getWritableDatabase();
    }

    public void cerrarConexion(){
        db.close();
    }

    public ReturnEntity ejecutar(String query){
        try{
            db.execSQL(query);
            return new ReturnEntity(0);
        }
        catch (Exception e){
            return new ReturnEntity(1,e.getMessage());
        }
    }


}