package com.assignment1.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Switch;


public class MainActivity extends Activity {
	Spinner spin1;
	EditText bigval;
	EditText smallval;
	Button convert,clear;
	TextView result;
	double km,m;
	double cel,fa;
	double dl,rs;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spin1=(Spinner)findViewById(R.id.spin);
		bigval=(EditText)findViewById(R.id.editText1);
		smallval=(EditText)findViewById(R.id.editText2);
		result=(TextView)findViewById(R.id.textView1);
		convert=(Button)findViewById(R.id.button1);
		clear=(Button)findViewById(R.id.button2);
		
		final String[] converterlist={"Length","Temperature","Currency"};
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,converterlist);
		spin1.setAdapter(adapter);
		spin1.setOnItemSelectedListener(new OnItemSelectedListener() {
		
			
		    @Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				// TODO Auto-generated method stub
		    	switch(pos)
		    	{
				case 0:
					bigval.setHint("Kilometer");
					smallval.setHint("Meter");
					convert.setOnClickListener(new OnClickListener() {
						
						
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
							if((bigval.getText().length()>0)&&(smallval.getText().length()>0)){
								result.setText("Enter single field");
							}
							else if(bigval.getText().length()>0){
								km=Double.parseDouble(bigval.getText().toString());
								m=km*1000;
								result.setText("Result:"+m+"m");
							}
							else if (smallval.getText().length()>0) {
								m=Double.parseDouble(smallval.getText().toString());
								km=m/1000;
								result.setText("Result:"+km+"km");
								
							}else{
								result.setText("Enter some Values");
							}
							
						}
					});
					break;
				case 1:
					bigval.setHint("Celsius");
					smallval.setHint("Fahrenheit");
					convert.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							if((bigval.getText().length()>0)&&(smallval.getText().length()>0)){
								result.setText("Enter single field");
							}
							
							else if(bigval.getText().length()>0){
								cel=Double.parseDouble(bigval.getText().toString());
								fa=(cel*1.8)+32;
								result.setText("Result:"+fa+"f");
							}
							else if (smallval.getText().length()>0) {
								fa=Double.parseDouble(smallval.getText().toString());
								cel=(fa-32)/1.8;
								result.setText("Result:"+cel+"c");
								
							}
							else{
								result.setText("Enter some Values");
							}
							
						}
					});
					
					break;
				case 2:
					bigval.setHint("Dolar");
					smallval.setHint("Rupee");
					convert.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							if((bigval.getText().length()>0)&&(smallval.getText().length()>0)){
								result.setText("Enter single field");
							}
							
							else if(bigval.getText().length()>0){
								dl=Double.parseDouble(bigval.getText().toString());
								rs=dl*66.16;
								result.setText("Result:"+rs+"rs");
							}
							else if (smallval.getText().length()>0) {
								rs=Double.parseDouble(smallval.getText().toString());
								dl=rs*0.15;
								result.setText("Result:"+dl+"$");
								
							}
							else{
								result.setText("Enter some Values");
							}
							
							
						}
					});
					
					
					break;

				default:
					break;
				}
				
				
				
				
				clear.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						bigval.setText("");
						smallval.setText("");
						result.setText("");
						
						
					}
				});
		    }
					
					
					
					
					
					
					


							

			
					

		    	
				
			

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}});
	

	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
