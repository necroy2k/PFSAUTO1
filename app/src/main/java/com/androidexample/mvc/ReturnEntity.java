package com.androidexample.mvc;

/**
 * Created by Necro on 06/09/2015.
 */
public class ReturnEntity {
    public int result;
    public String Errormessage;

    public ReturnEntity(int result){
        this.result = result;
    }
    public ReturnEntity(int result,String error){
        this.Errormessage = error;
        this.result = result;
    }
}
