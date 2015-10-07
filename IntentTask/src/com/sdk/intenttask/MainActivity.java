package com.sdk.intenttask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText name;
	EditText number;
	Button start,clear;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name=(EditText) findViewById(R.id.editText9);
        number=(EditText) findViewById(R.id.editText7);
        start=(Button) findViewById(R.id.button9);
        clear=(Button) findViewById(R.id.button8);
        
        name.setHint("Enter name");
		number.setHint("enter number");
        
		
        
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(name.getText().toString().length()==0 && number.getText().toString().length()==0)
				{
					Toast.makeText(MainActivity.this, "Enter the fields", Toast.LENGTH_SHORT).show();
				}
				else if(name.getText().toString().length()!=0 && number.getText().toString().length()!=0)
				{
					String i1=name.getText().toString();
			        String s1=number.getText().toString();
			        double i2=Double.parseDouble(s1);
			        
			        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
			        intent.putExtra("user_name", i1);
			        intent.putExtra("no.", i2);
			        
			        startActivity(intent);
				}
				else if(name.getText().toString().length()!=0 && number.getText().toString().length()==0)
				{
					String i1=name.getText().toString();
					String i3=number.getText().toString();
			        
			        
			        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
			        intent.putExtra("user_name", i1);
			        intent.putExtra("num", i3);
			        
			        startActivity(intent);
				}
				else if(name.getText().toString().length()==0 && name.getText().toString().length()!=0)
				{
					
			        String s1=number.getText().toString();
			        double i2=Double.parseDouble(s1);
			        
			        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
			       
			        intent.putExtra("no.", i2);
			        
			        startActivity(intent);
				}
				
				
			}
		});
        clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				name.setText("");
				number.setText("");
				
			}
		});
      }
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
