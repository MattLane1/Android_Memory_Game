/* HEADER
 * File Name: BMI_APP
 * Author Matthew Lane
 * Date Friday, April 3rd
 * Description This app calculates the users BMI.
 * */

package com.example.bmi_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
	
	int onCard = -1;
	
	//This array records what cards are where. The position in the array is the Button number it references. 
	//While the valur at the location, is the cards value. 1-13 (ace - king)
	
	int[] cardsDrawn = new int[16];
	int[] cardsPlaced = new int[16];
	
	int[] cardLocations = new int[16];
	int [] cards = new int[16];
	
	ArrayList<Integer> cardList = new ArrayList<Integer>();
	
	//When the program is started...
	public void onCreate(Bundle savedInstanceState) {
		
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Fill the array with 999. This will be our flag that the location is not set yet. 
		for (int a = 0; a < 16; a++)
			cardLocations[a] = 999;
		
		setUp();
		drawCards();
		decideCards();
		shuffleCards();
}
	
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//Decides and records what cards to use.
	public void drawCards(){
		  Random rand = new Random();
		  int cardVal;
		  
		  //This loop is run 8 times, each time it assigns a value between 1 (ace) and 13 (king)
		  for (int drawEight = 0; drawEight < 16; drawEight ++ ){
			  cardVal = rand.nextInt((52 - 1) + 1) + 1;
			  
			  if (Arrays.asList(cards[drawEight]).contains(cardVal) == false)
			  cards[drawEight] = cardVal;
			  
			  else
				  drawEight --;
		  }
	}
	
	//This function organizes the cards into the card placement array, they are placed side by side and then randomized. 
	public void decideCards(){
		int card;
		String ar = "";
		
		for (int a = 0; a < 16; a+=2){
			card = cards[a];
			
			cardLocations[a] = card;
			cardLocations[(a + 1)] = card;
		}
		
		for (int z = 0; z < 16; z ++)
			ar = ar + cardLocations[z] + ", ";
		
		System.out.println("The card array = " + ar);
	}
	
	public void shuffleCards(){
		
		String ak = "";
		
		for(int i=0;i<16;i++)
		{
		    cardList.add(cardLocations[i]);
		}
		
		Collections.shuffle(cardList);
		
		for (int z = 0; z < 16; z ++)
			ak = ak + cardList.get(z) + ", ";
		
		System.out.println("The SHUFFLED card array = " + ak);
	}
	
	//Decides and records where the drawn cards shall be placed. 
	public void placeCards(){
		  Random rand = new Random();
		 
		  //There are 16 possible locations any card could be in, so we loop 16 times
		  for (int location = 0; location < 16; location ++ ){
			 
			  //Get a random card position 
			  int local = rand.nextInt((15 - 1) + 1) + 1;
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
		  AlertDialog.Builder dlgAlert2  = new AlertDialog.Builder(this);  
		  dlgAlert2.setMessage("cards");
		  String debug = "";
		  
		  //Merge the arrays
		  for (int a = 0; a < 16; a++){
			     cardsPlaced[cardLocations[a]] = cardsDrawn[a];
			     
			     dlgAlert2.setMessage("Card location..." + cardLocations[a]);
			     dlgAlert2.create().show();
			     
			     debug = debug + cardsPlaced[cardLocations[a]] + ", ";
		  }
		//	 dlgAlert2.setTitle("Card array..." + debug);  
		//	 dlgAlert2.create().show();
	}
	
	
	public void flipCard(View v, int buttonNumber){
		//The array starts at 0, the first button is 1. This compensated for that.
		buttonNumber --;
		
		 ImageButton aButton = (ImageButton)v;
		 
		 AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);      
		 dlgAlert.setTitle("Numbers");
		 onCard ++;
		 

			 switch (cardList.get(buttonNumber)){
			 
			 case 1:
				 aButton.setImageResource(R.drawable.card_1c); 
				 break;
				 
			 case 2:
				 aButton.setImageResource(R.drawable.card_2c); 
				 break;
				 
			 case 3:
				 aButton.setImageResource(R.drawable.card_3c); 
				 break;
				 
			 case 4:
				 aButton.setImageResource(R.drawable.card_4c); 
				 break;
				 
			 case 5:
				 aButton.setImageResource(R.drawable.card_5c); 
				 break;
				 
			 case 6:
				 aButton.setImageResource(R.drawable.card_6c); 
				 break;
				 
			 case 7:
				 aButton.setImageResource(R.drawable.card_7c); 
				 break;
				 
			 case 8:
				 aButton.setImageResource(R.drawable.card_8c); 
				 break;
				 
			 case 9:
				 aButton.setImageResource(R.drawable.card_9c); 
				 break;
				 
			 case 10:
				 aButton.setImageResource(R.drawable.card_10c); 
				 break;
				 
			 case 11:
				 aButton.setImageResource(R.drawable.card_11c); 
				 break;
				 
			 case 12:
				 aButton.setImageResource(R.drawable.card_12c); 
				 break;
				 
			 case 13:
				 aButton.setImageResource(R.drawable.card_13c); 
				 break;
				 
			 case 14:
				 aButton.setImageResource(R.drawable.card_1d); 
				 break;
				 
			 case 15:
				 aButton.setImageResource(R.drawable.card_2d); 
				 break;
				 
			 case 16:
				 aButton.setImageResource(R.drawable.card_3d); 
				 break;
				 
			 case 17:
				 aButton.setImageResource(R.drawable.card_4d); 
				 break;
				 
			 case 18:
				 aButton.setImageResource(R.drawable.card_5d); 
				 break;
				 
			 case 19:
				 aButton.setImageResource(R.drawable.card_6d); 
				 break;
				 
			 case 20:
				 aButton.setImageResource(R.drawable.card_7d); 
				 break;
				 
			 case 21:
				 aButton.setImageResource(R.drawable.card_8d); 
				 break;
				 
			 case 22:
				 aButton.setImageResource(R.drawable.card_9d); 
				 break;
				 
			 case 23:
				 aButton.setImageResource(R.drawable.card_10d); 
				 break;
				 
			 case 24:
				 aButton.setImageResource(R.drawable.card_11d); 
				 break;
				 
			 case 25:
				 aButton.setImageResource(R.drawable.card_12d); 
				 break;
				 
			 case 26:
				 aButton.setImageResource(R.drawable.card_13d); 
				 break;
				 
			 case 27:
				 aButton.setImageResource(R.drawable.card_1h); 
				 break;
				 
			 case 28:
				 aButton.setImageResource(R.drawable.card_2h); 
				 break;
				 
			 case 29:
				 aButton.setImageResource(R.drawable.card_3h); 
				 break;
				 
			 case 30:
				 aButton.setImageResource(R.drawable.card_4h); 
				 break;
				 
			 case 31:
				 aButton.setImageResource(R.drawable.card_5h); 
				 break;
				 
			 case 32:
				 aButton.setImageResource(R.drawable.card_6h); 
				 break;
				 
			 case 33:
				 aButton.setImageResource(R.drawable.card_7h); 
				 break;
				 
			 case 34:
				 aButton.setImageResource(R.drawable.card_8h); 
				 break;
				 
			 case 35:
				 aButton.setImageResource(R.drawable.card_9h); 
				 break;
				 
			 case 36:
				 aButton.setImageResource(R.drawable.card_10h); 
				 break;
				 
			 case 37:
				 aButton.setImageResource(R.drawable.card_11h); 
				 break;
				 
			 case 38:
				 aButton.setImageResource(R.drawable.card_12h); 
				 break;
				 
			 case 39:
				 aButton.setImageResource(R.drawable.card_13h); 
				 break;
				 
			 case 40:
				 aButton.setImageResource(R.drawable.card_1s); 
				 break;
				 
			 case 41:
				 aButton.setImageResource(R.drawable.card_2s); 
				 break;
				 
			 case 42:
				 aButton.setImageResource(R.drawable.card_3s); 
				 break;
				 
			 case 43:
				 aButton.setImageResource(R.drawable.card_4s); 
				 break;
				 
			 case 44:
				 aButton.setImageResource(R.drawable.card_5s); 
				 break;
				 
			 case 45:
				 aButton.setImageResource(R.drawable.card_6s); 
				 break;
				 
			 case 46:
				 aButton.setImageResource(R.drawable.card_7s); 
				 break;
				 
			 case 47:
				 aButton.setImageResource(R.drawable.card_8s); 
				 break;
				 
			 case 48:
				 aButton.setImageResource(R.drawable.card_9s); 
				 break;
				 
			 case 49:
				 aButton.setImageResource(R.drawable.card_10s); 
				 break;
				 
			 case 50:
				 aButton.setImageResource(R.drawable.card_11s); 
				 break;
				 
			 case 51:
				 aButton.setImageResource(R.drawable.card_12s); 
				 break;
				 
			 case 52:
				 aButton.setImageResource(R.drawable.card_13s); 
				 break;
				 
				
			default :
				 dlgAlert.setTitle("Bad card! = " + cardsPlaced[onCard]);
				 dlgAlert.show();
				 aButton.setImageResource(R.drawable.ic_launcher); 
				 break;
			 }
			 
		 }
		 
//	}
	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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
					 
			 flipCard(v, 1);
		}
	  });
	    
	    //Button Two Section
	    b2 = (ImageButton) findViewById(R.id.imageButton2);    
	    b2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 2);
			
		}
	  });
	    
	    //Button Three Section
	    b3 = (ImageButton) findViewById(R.id.imageButton3);    
	    b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 3);
			
		}
	  });
	    
	    //Button Four Section
	    b4 = (ImageButton) findViewById(R.id.imageButton4);    
	    b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 4);
			
		}
	  });
	    
	    //Button Five Section
	    b5 = (ImageButton) findViewById(R.id.imageButton5);    
	    b5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 5);
			
		}
	  });
	    
	    //Button Six Section
	    b6 = (ImageButton) findViewById(R.id.imageButton6);    
	    b6.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 6); 
			
		}
	  });
	    
	    //Button Seven Section
	    b7 = (ImageButton) findViewById(R.id.imageButton7);    
	    b7.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 7);
			
		}
	  });
	    
	    //Button Eight Section
	    b8 = (ImageButton) findViewById(R.id.imageButton8);    
	    b8.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 8);
			
		}
	  });
	    
	    //Button nine Section
	    b9 = (ImageButton) findViewById(R.id.imageButton9);    
	    b9.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 9); 
			
		}
	  });
	    
	    //Button Ten Section
	    b10 = (ImageButton) findViewById(R.id.imageButton10);    
	    b10.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 10);
			
		}
	  });
	    
	    //Button Eleven Section
	    b11 = (ImageButton) findViewById(R.id.imageButton11);    
	    b11.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 11);
			
		}
	  });
	    
	    //Button Twelve Section
	    b12 = (ImageButton) findViewById(R.id.imageButton12);    
	    b12.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 12);
			
		}
	  });
	    
	    //Button Thirteen Section
	    b13 = (ImageButton) findViewById(R.id.imageButton13);    
	    b13.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 13);
			
		}
	  });
	    
	    //Button Fourteen Section
	    b14 = (ImageButton) findViewById(R.id.imageButton14);    
	    b14.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 14);
			
		}
	  });
	    
	    //Button Fifteen Section
	    b15 = (ImageButton) findViewById(R.id.imageButton15);    
	    b15.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 15);
			
		}
	  });
	    
	    //Button Sixteen Section
	    b16 = (ImageButton) findViewById(R.id.imageButton16);    
	    b16.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {//This function is called when a card is clicked. 
			
			flipCard(v, 16);
			
		}
	  });
	    
	}
}
	

	
	

		

		
	
	  


