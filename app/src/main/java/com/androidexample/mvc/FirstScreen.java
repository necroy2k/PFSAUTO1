package com.androidexample.mvc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Intent;

public class FirstScreen extends Activity {

	public void save(View view) {
		UsuarioBiz user = new UsuarioBiz();
		ReturnEntity re = user.SaveUser(new UsuarioEntity(1,"pepe"),this);
		String salida = re.Errormessage.toString();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstscreen);

		final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);
		final Button secondBtn = (Button) findViewById(R.id.buttonSignIn);

		//Get Global Controller Class object (see application tag in AndroidManifest.xml)
		final Controller aController = (Controller) getApplicationContext();
		
		/******************  Create Dummy Products Data  ***********/
		


		/******************  Products Data Creation End   ***********/
		
		
		/******* Create view elements dynamically and show on activity ******/
		
		//Product arraylist size
		int ProductsSize = aController.getProductsArraylistSize();
		
		// create the layout params that will be used to define how your
	    // button will be displayed
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
	            LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
	/******** Dynamically create view elements - Start **********/

		for(int j=0;j< ProductsSize;j++)
		{
			// Get probuct data from product data arraylist
			String pName = aController.getProducts(j).getProductName();
			int pPrice   = aController.getProducts(j).getProductPrice();

			// Create LinearLayout to view elemnts
			LinearLayout ll = new LinearLayout(this);
			ll.setOrientation(LinearLayout.HORIZONTAL);

			TextView product = new TextView(this);
			product.setText(" "+pName+"    ");

			//Add textView to LinearLayout
			ll.addView(product);

			TextView price = new TextView(this);
			price.setText("  $"+pPrice+"     ");

			//Add textView to LinearLayout
			ll.addView(price);

			final Button btn = new Button(this);
				btn.setId(j+1);
				btn.setText("Add To Cart");

				// set the layoutParams on the button
				btn.setLayoutParams(params);

			    final int index = j;

			    //Create click listener for dynamically created button
			    btn.setOnClickListener(new OnClickListener() {
			        public void onClick(View v) {

			        	//Clicked button index
			            Log.i("TAG", "index :" + index);

			            // Get product instance for index
			            ModelProducts tempProductObject = aController.getProducts(index);

			            //Check Product already exist in Cart or Not
			            if(!aController.getCart().checkProductInCart(tempProductObject))
			            {
			            	btn.setText("Added");

			            	// Product not Exist in cart so add product to
			            	// Cart product arraylist
			            	aController.getCart().setProducts(tempProductObject);

			            	Toast.makeText(getApplicationContext(), "Now Cart size: "+aController.getCart().getCartSize(),
			            			Toast.LENGTH_LONG).show();
			            }
			            else
			            {
			            	// Cart product arraylist contains Product
			            	Toast.makeText(getApplicationContext(), "Product "+(index+1)+" already added in cart.",
			            			Toast.LENGTH_LONG).show();
			            }
			        }
			    });

			    //Add button to LinearLayout
			    ll.addView(btn);

			    //Add LinearLayout to XML layout
			    lm.addView(ll);
		}

		/******** Dynamically create view elements - End **********/

		secondBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent i = new Intent(getBaseContext(), SecondScreen.class);
				startActivity(i);
			}
		});
	}
}
