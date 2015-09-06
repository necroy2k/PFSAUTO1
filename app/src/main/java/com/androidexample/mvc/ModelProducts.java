package com.androidexample.mvc;

public class ModelProducts {
	
	private String productName;
	private String productDesc;
	private int productPrice;
	
    public ModelProducts(String productName,String productDesc,int productPrice)
    {
    	this.productName  = productName;
    	this.productDesc  = productDesc;
    	this.productPrice = productPrice;
    }
	
	public String getProductName() {
		
		return productName;
	}
   
    public String getProductDesc() {
		
		return productDesc;
	}
	
    public int getProductPrice() {
		
		return productPrice;
	}
		
}
