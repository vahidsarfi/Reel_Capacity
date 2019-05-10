package com.example.reel_capacity;

import com.example.reel_capacity.R.id;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_2 extends Activity {
	

	double N;
	double P;
	double L;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	    final EditText te_flang = (EditText) findViewById(id.EditText_Flang);
	    final EditText te_barrel = (EditText) findViewById(id.EditText_Barrel);
	    final EditText te_trav = (EditText) findViewById(id.EditText_Trav);
	    final EditText te_empty = (EditText) findViewById(id.EditText_Empty);
	    final EditText te_Diameter = (EditText) findViewById(id.EditText_Diameter);
	    
	    

	    te_flang.setText(getIntent().getExtras().getString("intent_flang"));
	    te_barrel.setText(getIntent().getExtras().getString("intent_barrel"));
	    te_trav.setText(getIntent().getExtras().getString("intent_trav"));
	    
	    te_Diameter.requestFocus();
	    
		
	    
	    
		final TextView tv_length = (TextView) findViewById(id.TextView_Length);		
		Button b= (Button) findViewById(id.button_Calculate);
				
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				// this condition is for blank fields to stop the calculation
				
				if (te_flang.getText().toString().matches("") || te_barrel.getText().toString().matches("") || te_trav.getText().toString().matches("") || te_Diameter.getText().toString().matches("")) {
					tv_length.setText("Empty Fields?!");
				
					tv_length.setTextColor(Color.parseColor("#FF0000"));
					
				} else 	{
					tv_length.setTextColor(Color.parseColor("#000000"));
					//This condition equals the empty field to cable diameter when the empty field is empty!! 
					
					if (te_empty.getText().toString().matches("")){
						te_empty.setText(te_Diameter.getText().toString());
					}
					
					double F =Double.parseDouble(te_flang.getText().toString());
					double B =Double.parseDouble(te_barrel.getText().toString());
					double T =Double.parseDouble(te_trav.getText().toString());
					double E =Double.parseDouble(te_empty.getText().toString());
					double D =Double.parseDouble(te_Diameter.getText().toString());
					
					N=Math.floor(0.95*T/D);
					P=Math.floor((F-B-2*E)/(2*D));
					L=Math.floor(3.14*N*P*(B+(P*D))/1000);
					
					tv_length.setText(String.valueOf((int)L));

					
					
				}
			}
		});		
		
		b.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View arg0) {
				tv_length.setText("N="+String.valueOf((int)N)+" P="+String.valueOf((int)P));
				return false;
			}
		});

	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mymenu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId()==R.id.about_us){
			Intent intent_about = new Intent(Main_2.this, About_Us.class );
			startActivity(intent_about);
			finish();
		}
		if(item.getItemId()==R.id.wooden_reels){
			Intent intent_wooden = new Intent(Main_2.this, Wooden_Reels.class );
			startActivity(intent_wooden);
			finish();
		}
		if(item.getItemId()==R.id.metallic_reels){
			Intent intent_metallic = new Intent(Main_2.this, Metallic_Reels.class );
			startActivity(intent_metallic);
			finish();
		}
		return super.onOptionsItemSelected(item);
	}

}
