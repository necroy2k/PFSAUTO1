package com.androidexample.mvc;

import java.util.ArrayList;

public class UsuarioData{

    private  ArrayList<ModelProducts> cartProducts = new ArrayList<ModelProducts>();


    public ModelProducts getUsuario(int pPosition) {

        //usuario
        return cartProducts.get(pPosition);
    }

    public void setProducts(ModelProducts Products) {

        cartProducts.add(Products);

    }

    public int getCartSize() {

        return cartProducts.size();

    }

    public boolean checkProductInCart(ModelProducts aProduct) {

        return cartProducts.contains(aProduct);

    }

}