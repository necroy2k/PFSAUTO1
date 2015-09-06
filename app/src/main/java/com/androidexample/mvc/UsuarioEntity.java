package com.androidexample.mvc;

/**
 * Created by Necro on 06/09/2015.
 */
public class UsuarioEntity {

    private int entityID;
    private String paizoID;

    public UsuarioEntity(int ID, String paizoID){
        this.entityID = ID;
        this.paizoID = paizoID;
    }

    public String getPaizoID() {
        return paizoID;
    }

    public int getId() {
        return entityID;
    }
}
