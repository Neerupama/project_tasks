package com.sdk.intenttask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {

	TextView greet;
	TextView add;
	TextView sub;
	TextView mul;
	TextView div;
	TextView resultTextView;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		greet=(TextView) findViewById(R.id.textView1);
		add=(TextView) findViewById(R.id.textView2);
		sub=(TextView) findViewById(R.id.textView3);
		mul=(TextView) findViewById(R.id.textView4);
		div=(TextView) findViewById(R.id.textView5);
		
		
		
		Intent intent=getIntent();
		Bundle b1=intent.getExtras();
		String s1=b1.getString("user_name");
		if(s1!=null){
		
			greet.setText("Hi, "+s1+"!");
		}
		double d1=b1.getDouble("no.");
		
		if(b1.getString("num")==null){
		add.setText(dToS(d1+5));
		sub.setText(dToS(d1-5));
		mul.setText(dToS(d1*5));
		div.setText(dToS(d1/5));
		}else {
			
			add.setText("Null");
			sub.setText("Null");
			mul.setText("Null");
			div.setText("Null");
		}
		
		
	}
	public static String dToS(double i)
	{
		
		return Double.toString(i);
		
		
	}

	

}