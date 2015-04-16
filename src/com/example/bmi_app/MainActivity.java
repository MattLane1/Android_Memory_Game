/* HEADER
 * File Name: BMI_APP
 * Author Matthew Lane
 * Date Friday, April 3rd
 * Description This app calculates the users BMI.
 * */

package com.example.bmi_app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
 
//The beginning of the program
public class MainActivity extends Activity {
 
	final Context context = this;
	private EditText result;

	
	//When the program is started...
	public void onCreate(Bundle savedInstanceState) {
		
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ImageButton b1;
		final ImageButton b2;
		final ImageButton b3;
		final ImageButton b4;
		final ImageButton b5;
		final ImageButton b6;
		final ImageButton b7;
		final ImageButton b8;
		final ImageButton b9;
		final ImageButton b10;
		final ImageButton b11;
		final ImageButton b12;
		final ImageButton b13;
		final ImageButton b14;
		final ImageButton b15;
		final ImageButton b16;
		
		//Button One Section
	    b1 = (ImageButton) findViewById(R.id.imageButton1);    
	    b1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Two Section
	    b2 = (ImageButton) findViewById(R.id.imageButton2);    
	    b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Three Section
	    b3 = (ImageButton) findViewById(R.id.imageButton3);    
	    b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Four Section
	    b4 = (ImageButton) findViewById(R.id.imageButton4);    
	    b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Five Section
	    b5 = (ImageButton) findViewById(R.id.imageButton5);    
	    b5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Six Section
	    b6 = (ImageButton) findViewById(R.id.imageButton6);    
	    b6.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Seven Section
	    b7 = (ImageButton) findViewById(R.id.imageButton7);    
	    b7.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Eight Section
	    b8 = (ImageButton) findViewById(R.id.imageButton8);    
	    b8.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button nine Section
	    b9 = (ImageButton) findViewById(R.id.imageButton9);    
	    b9.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Ten Section
	    b10 = (ImageButton) findViewById(R.id.imageButton10);    
	    b10.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Eleven Section
	    b11 = (ImageButton) findViewById(R.id.imageButton11);    
	    b11.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Twelve Section
	    b12 = (ImageButton) findViewById(R.id.imageButton12);    
	    b12.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Thirteen Section
	    b13 = (ImageButton) findViewById(R.id.imageButton13);    
	    b13.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Fourteen Section
	    b14 = (ImageButton) findViewById(R.id.imageButton14);    
	    b14.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Fifteen Section
	    b15 = (ImageButton) findViewById(R.id.imageButton15);    
	    b15.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	    //Button Sixteen Section
	    b16 = (ImageButton) findViewById(R.id.imageButton16);    
	    b16.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			 ImageButton aButton = (ImageButton)v;
			 aButton.setImageResource(R.drawable.card_1c); 
			
		}
	  });
	    
	}
}
	
	

		

		
	
	  


