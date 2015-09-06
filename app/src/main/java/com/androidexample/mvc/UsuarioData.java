package com.androidexample.mvc;

import java.util.ArrayList;

public class UsuarioData{

    private  ArrayList<ModelProducts> cartProducts = new ArrayList<ModelProducts>();


    public UsuarioEntity getUsuario(String id) {
        //SQL QUERRY
        UsuarioEntity usuario = new UsuarioEntity("asd","pepe");
        return usuario;
    }

    public ArrayList<UsuarioEntity> getUsuarioByEvent(String Eventid) {
        //SQL QUERRY
        ArrayList<UsuarioEntity> userList = new ArrayList<UsuarioEntity>();
        return userList;
    }


    public ReturnEntity SaveUser(UsuarioEntity usuarioNuevo) {
        //SQL QUERRY
        return new ReturnEntity();
    }

    public ReturnEntity SaveUsers(ArrayList<UsuarioEntity> Listadeusuarios) {
        //SQL QUERRY
        return new ReturnEntity();
    }
}