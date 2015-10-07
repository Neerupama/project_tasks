package com.widget.button1;
import android.os.Bundle;

import android.app.Activity;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.Menu;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener {

	RadioButton radiobuttonoption1;
	RadioButton radioButtonoption2;
	RadioGroup radiogroupselections;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		radiobuttonoption1 = (RadioButton)findViewById(R.id.radioButtonoption1);
        radioButtonoption2 = (RadioButton)findViewById(R.id.radioButtonoption2);
        radiogroupselections=(RadioGroup) findViewById(R.id.radioGroup1);
        radiogroupselections.setOnCheckedChangeListener(MainActivity.this);
      //this is the code for radiobuttonoption1   
      		radiobuttonoption1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
      			
      			@Override
      			public void onCheckedChanged(CompoundButton arg0, boolean state) {
      				if(state){
      					Toast.makeText(MainActivity.this, "you selected option 1", Toast.LENGTH_SHORT).show();
      				}
      			}
      				
      			});

	
	//this is the code for radioButtonoption2
			radioButtonoption2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				
				@Override
				public void onCheckedChanged(CompoundButton arg0, boolean state) {
					// TODO Auto-generated method stub
					if (state){
						Toast.makeText(MainActivity.this, "you selected option 2", Toast.LENGTH_SHORT).show();
						
					}
				}
			});
			
	    }
//this is the code for radiogroup
	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) {
		
		switch (id) {
		case R.id.radioselection1:
			Toast.makeText(MainActivity.this, "you selected Selection 1", Toast.LENGTH_SHORT).show();
			
			break;
		case R.id.radioselection2:
			Toast.makeText(MainActivity.this, "you selected Selection 2", Toast.LENGTH_SHORT).show();
			
			break;
		case R.id.radioselection3:
			Toast.makeText(MainActivity.this, "you selected Selection 3", Toast.LENGTH_SHORT).show();
			
			break;
		

		default:
			break;
		}
		
	}}
			
		
      


	