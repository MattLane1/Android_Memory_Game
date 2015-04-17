/* HEADER
 * File Name: BMI_APP
 * Author Matthew Lane
 * Date Friday, April 3rd
 * Description This app calculates the users BMI.
 * */

package com.example.bmi_app;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsoluteLayout;
import android.widget.EditText;
import android.widget.ImageButton;
 
//The beginning of the program
public class MainActivity extends Activity {
 
	final Context context = this;
	private EditText result;
	
	//This array records what cards are where. The position in the array is the Button number it references. 
	//While the valur at the location, is the cards value. 1-13 (ace - king)
	int[] cardLocations = new int[16];
	int[] cardsDrawn = new int[16];
	int[] cardsPlaced = new int[16];
	//When the program is started...
	public void onCreate(Bundle savedInstanceState) {
		
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setUp();
		drawCards();
		placeCards();
}
	//Decides and records what cards to use.
	public void drawCards(){
		  Random rand = new Random();
		  
		  //This loop is run 8 times, each time it assigns a value between 1 (ace) and 13 (king)
		  for (int drawEight = 0; drawEight < 16; drawEight ++ ){
			  cardsDrawn[drawEight] = rand.nextInt((52 - 1) + 1) + 1;
		  }
	}
	
	//Decides and records where the drawn cards shall be placed. 
	public void placeCards(){
		  Random rand = new Random();
		 
		  //There are 16 possible locations any card could be in, so we loop 16 times
		  for (int location = 0; location < 16; location ++ ){
			 
			  //Get a random card position 
			  int local = rand.nextInt((16 - 1) + 1) + 1;
			  boolean used = false;
			  
			  //This loop is comparing the new random value to all the values in the array. If it doesnt match, it is stored.
			  for (int a = 0; a < cardLocations.length; a ++){
				  
				  if (local == cardLocations[a])
					   used = true;
			  }
			  
			  //The POSITION in the array is the buttons NUMBER, the VALUE is the TYPE of card to be used at the POSITION
			  if (used == false)
				  cardLocations[location] = local;
			  	  
		//	  cardsDrawn[drawEight] = rand.nextInt((52 - 1) + 1) + 1;
		  }
		  
		  //Merge the arrays
		  for (int a = 0; a < 16; a++)
			     cardsPlaced[cardLocations[a]] = cardsDrawn[a];
	}
	
	
	//This function is called when a card is clicked
	public void playGame(){
		
	}
	
	public void flipCard(View v){
		 ImageButton aButton = (ImageButton)v;
		 
		 for (int b = 0; b < 16; b++){
			 switch (cardsPlaced[b]){
			 
			 case 1:
				 aButton.setImageResource(R.drawable.card_1c); 
				 break;
				 
			default :
				 aButton.setImageResource(R.drawable.card_10c); 
				 break;
			 }
			 
		 }
		 
	}
	
	//This rather hefty function created the objects of the buttons, and ties in the event handlers.
	public void setUp(){
		
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
					 
			 flipCard(v);
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
	

	
	

		

		
	
	  


