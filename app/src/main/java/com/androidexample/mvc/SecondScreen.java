package com.androidexample.mvc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondscreen); 
    
		TextView showCartContent    = (TextView) findViewById(R.id.showCart);
		final Button thirdBtn 		= (Button) findViewById(R.id.third);
		
		//Get Global Controller Class object (see application tag in AndroidManifest.xml)
		final Controller aController = (Controller) getApplicationContext();
		
		// Get Cart Size
		final int cartSize = aController.getCart().getCartSize();
		
		String showString = "";
		
/******** Show Cart Products on screen - Start ********/
		
		if(cartSize >0)
		{	
			
			for(int i=0;i<cartSize;i++)
			{
				//Get product details
				String pName 	= aController.getCart().getProducts(i).getProductName();
				int pPrice   	= aController.getCart().getProducts(i).getProductPrice();
				String pDisc   	= aController.getCart().getProducts(i).getProductDesc();
				
				showString += "\n\nProduct Name : "+pName+"\n"+
	                               "Price : "+pPrice+"\n"+
	                               "Discription : "+pDisc+""+
	                               "\n -----------------------------------";
			}
		}
		else
			showString = "\n\nShopping cart is empty.\n\n";
		
		showCartContent.setText(showString);
		
/******** Show Cart Products on screen - End ********/
		
		thirdBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(cartSize >0)
				{
					Intent i = new Intent(getBaseContext(), ThirdScreen.class);
					startActivity(i);
				}
				else
					Toast.makeText(getApplicationContext(), 
							"Shopping cart is empty.", 
	            			Toast.LENGTH_LONG).show();
			}
		});
		
	} 
	
	@Override
    protected void onDestroy() {
		
        super.onDestroy();
        
    }
}
