package com.androidexample.mvc;
import java.util.ArrayList;
import android.content.Context;


public class UsuarioData{

    private  ArrayList<ModelProducts> cartProducts = new ArrayList<ModelProducts>();
    private ConexionDB asd;

public UsuarioEntity getUsuario(String id) {
        //SQL QUERRY
        UsuarioEntity usuario = new UsuarioEntity(0,"pepe");
        return usuario;
    }

    public ArrayList<UsuarioEntity> getUsuarioByEvent(String Eventid) {
        //SQL QUERRY
        ArrayList<UsuarioEntity> userList = new ArrayList<UsuarioEntity>();
        return userList;
    }


    public ReturnEntity SaveUser(UsuarioEntity user, Context c) {
        try
        {
            String query="INSERT INTO user(paizoID) VALUES('"+user.getPaizoID()+"');";
            ConexionDB DB = new ConexionDB(c);
            DB.abrirConexion();
            ReturnEntity Result = DB.ejecutar(query);
            DB.cerrarConexion();
            return Result;
        }
        catch (Exception e)
        {
            return new ReturnEntity(1,e.getMessage());
        }
    }

    public ReturnEntity SaveUsers(ArrayList<UsuarioEntity> userList, Context Contexto) {
        try
        {
            for (UsuarioEntity useractual : userList)
            {
                SaveUser(useractual,Contexto );
            }
            return new ReturnEntity(0);
        }
        catch (Exception e)
        {
                return new ReturnEntity(1,e.getMessage());
        }
    }

    public ReturnEntity EditUser(UsuarioEntity userList) {
        //SQL QUERRY
        return new ReturnEntity(0);
    }
}