package com.androidexample.mvc;

import java.util.ArrayList;
import android.app.Application;

public class Controller extends Application{
	
	private  ArrayList<ModelProducts> myProducts = new ArrayList<ModelProducts>();
	private  ModelCart myCart = new ModelCart();
	

	public ModelProducts getProducts(int pPosition) {
		
		return myProducts.get(pPosition);
	}
	
	public void setProducts(ModelProducts Products) {
	   
		myProducts.add(Products);
		
	}	
	
	public ModelCart getCart() {
		   
		return myCart;
		
	}
 
   public int getProductsArraylistSize() {
		
		return myProducts.size();
	}
   
}
