package com.androidexample.mvc;

import java.util.ArrayList;
import android.app.Application;
import android.content.Context;

public class UsuarioBiz extends Application {
    private UsuarioData Odata;

    public ReturnEntity SaveUser(UsuarioEntity user, Context c) {
        try
        {
            Odata = new UsuarioData();
            return Odata.SaveUser(user,c);
        }
        catch (Exception e)
        {
            return new ReturnEntity(1,e.getMessage());
        }
    }
}