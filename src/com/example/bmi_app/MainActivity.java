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
 
//The beginning of the program
public class MainActivity extends Activity {
 
	final Context context = this;
	private Button button;
	private EditText result;
	float BMI;
	//When the program is started...
	public void onCreate(Bundle savedInstanceState) {
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*
		Button button = (Button)findViewById(R.id.imageButton1);
		AbsoluteLayout.LayoutParams absParams = 
		    (AbsoluteLayout.LayoutParams)button.getLayoutParams();
		absParams.x = 50;
		absParams.y = 20;
		button.setLayoutParams(absParams);
		
		/*
	    Button myButton = (Button) findViewById(R.id.imageButton1);
		myButton.setX(20);
		myButton.setY(20);
		
	/*	
		myButton = (Button) findViewById(R.id.imageButton2);
		myButton.setX(60);
		
		myButton = (Button) findViewById(R.id.imageButton3);
		myButton.setX(120);
		myButton.setY(120);
		myButton.setY(120);
 */
		// components from main.xml
		//button = (Button) findViewById(R.id.buttonPrompt);
		//result = (EditText) findViewById(R.id.editTextResult);
 
		// add button listener
	//	button.setOnClickListener(new OnClickListener() {
 /*
			@Override//When the user clicks the calculate button. 
			public void onClick(View arg0) {
 
				// get prompts.xml view
				LayoutInflater li = LayoutInflater.from(context);
				View promptsView = li.inflate(R.layout.prompts, null);
 
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);
 
				// set prompts.xml to alertdialog builder
				alertDialogBuilder.setView(promptsView);
				
				//Get their info
				final EditText userInputHeight = (EditText) promptsView
						.findViewById(R.id.editTextDialogUserInputHeight);
				
				final EditText userInputWeight = (EditText) promptsView
						.findViewById(R.id.editTextDialogUserInputWeight);
				
				
				float height;
				float weight;
				String tempHeight;
				String tempWeight;
				
				//Get info
				tempHeight = userInputHeight.toString();
				tempHeight = tempHeight.replaceAll("\\D+","");
				
				tempWeight = userInputWeight.toString();
				tempWeight = tempWeight.replaceAll("\\D+","");
				
				//Switch to numbers
				height = Float.parseFloat(tempHeight);
				weight = Float.parseFloat(tempWeight);
				
				//Calculate BMI
				BMI = ((weight * 703) / (height * height));
				
				// set dialog message
				alertDialogBuilder
					.setCancelable(false)
					.setPositiveButton("OK",
					  new DialogInterface.OnClickListener() {
					    public void onClick(DialogInterface dialog,int id) {
						// get user input and set it to result
						// edit text
						result.setText(Float.toString(BMI));
					    }
					  })
					.setNegativeButton("Cancel",
					  new DialogInterface.OnClickListener() {
					    public void onClick(DialogInterface dialog,int id) {
						dialog.cancel();
					    }
					  });
 
				// Create a dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// Show said dialog. 
				alertDialog.show();
 
			}
			
		});
		*/
	}
}
