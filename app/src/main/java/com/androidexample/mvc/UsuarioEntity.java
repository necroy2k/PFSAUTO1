package com.androidexample.mvc;

/**
 * Created by Necro on 06/09/2015.
 */
public class UsuarioEntity {

    private String nombre;
    private String id;

    public UsuarioEntity(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getMombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
}
