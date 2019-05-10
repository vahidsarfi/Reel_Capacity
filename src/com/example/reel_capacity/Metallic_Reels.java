package com.example.reel_capacity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Metallic_Reels extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.metalic_reels);
		
		Button b630 = (Button) findViewById(R.id.b_630);
		b630.setOnClickListener(this);
		Button b800 = (Button) findViewById(R.id.b_800);
		b800.setOnClickListener(this);
		Button b1000 = (Button) findViewById(R.id.b_1000);
		b1000.setOnClickListener(this);
		Button b1250 = (Button) findViewById(R.id.b_1250);
		b1250.setOnClickListener(this);
		Button b1600 = (Button) findViewById(R.id.b_1600);
		b1600.setOnClickListener(this);
		Button b2000M = (Button) findViewById(R.id.b_2000M);
		b2000M.setOnClickListener(this);
		Button b2000NM = (Button) findViewById(R.id.b_2000NM);
		b2000NM.setOnClickListener(this);
		Button b2250 = (Button) findViewById(R.id.b_2250);
		b2250.setOnClickListener(this);
		Button b2500 = (Button) findViewById(R.id.b_2500);
		b2500.setOnClickListener(this);
		Button b3000 = (Button) findViewById(R.id.b_3000);
		b3000.setOnClickListener(this);
		Button b3200 = (Button) findViewById(R.id.b_3200);
		b3200.setOnClickListener(this);
		Button b3600 = (Button) findViewById(R.id.b_3600);
		b3600.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.b_630) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "630");
			intent_reel.putExtra("intent_barrel", "630");
			intent_reel.putExtra("intent_trav", "630");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_800) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "800");
			intent_reel.putExtra("intent_barrel", "350");
			intent_reel.putExtra("intent_trav", "520");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_1000) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1000");
			intent_reel.putExtra("intent_barrel", "573");
			intent_reel.putExtra("intent_trav", "630");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_1250) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1250");
			intent_reel.putExtra("intent_barrel", "600");
			intent_reel.putExtra("intent_trav", "790");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_1600) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1600");
			intent_reel.putExtra("intent_barrel", "812");
			intent_reel.putExtra("intent_trav", "1000");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_2000M) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "2000");
			intent_reel.putExtra("intent_barrel", "930");
			intent_reel.putExtra("intent_trav", "1300");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_2000NM) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "2000");
			intent_reel.putExtra("intent_barrel", "1070");
			intent_reel.putExtra("intent_trav", "1240");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_2250) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "2250");
			intent_reel.putExtra("intent_barrel", "1210");
			intent_reel.putExtra("intent_trav", "1190");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_2500) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "2500");
			intent_reel.putExtra("intent_barrel", "1470");
			intent_reel.putExtra("intent_trav", "1590");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_3000) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "3000");
			intent_reel.putExtra("intent_barrel", "1900");
			intent_reel.putExtra("intent_trav", "1570");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_3200) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "3200");
			intent_reel.putExtra("intent_barrel", "1790");
			intent_reel.putExtra("intent_trav", "1790");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_3600) {
			Intent intent_reel = new Intent(Metallic_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "3600");
			intent_reel.putExtra("intent_barrel", "2400");
			intent_reel.putExtra("intent_trav", "1750");
			startActivity(intent_reel);
			finish();
		}
	}
	
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent intent_main = new Intent(Metallic_Reels.this, Main.class );
		startActivity(intent_main);
		finish();
	}



}
