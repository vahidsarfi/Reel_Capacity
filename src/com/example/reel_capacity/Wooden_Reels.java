package com.example.reel_capacity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Wooden_Reels extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wooden_reels);
		
		Button b70 = (Button) findViewById(R.id.b_70);
		b70.setOnClickListener(this);
		Button b80 = (Button) findViewById(R.id.b_80);
		b80.setOnClickListener(this);
		Button b90 = (Button) findViewById(R.id.b_90);
		b90.setOnClickListener(this);
		Button b100 = (Button) findViewById(R.id.b_100);
		b100.setOnClickListener(this);
		Button b110 = (Button) findViewById(R.id.b_110);
		b110.setOnClickListener(this);
		Button b115 = (Button) findViewById(R.id.b_115);
		b115.setOnClickListener(this);
		Button b120 = (Button) findViewById(R.id.b_120);
		b120.setOnClickListener(this);
		Button b140 = (Button) findViewById(R.id.b_140);
		b140.setOnClickListener(this);
		Button b160little = (Button) findViewById(R.id.b_160little);
		b160little.setOnClickListener(this);
		Button b160big = (Button) findViewById(R.id.b_160big);
		b160big.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.b_70) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "700");
			intent_reel.putExtra("intent_barrel", "330");
			intent_reel.putExtra("intent_trav", "500");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_80) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "800");
			intent_reel.putExtra("intent_barrel", "390");
			intent_reel.putExtra("intent_trav", "550");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_90) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "900");
			intent_reel.putExtra("intent_barrel", "450");
			intent_reel.putExtra("intent_trav", "600");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_100) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1000");
			intent_reel.putExtra("intent_barrel", "530");
			intent_reel.putExtra("intent_trav", "770");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_110) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1100");
			intent_reel.putExtra("intent_barrel", "570");
			intent_reel.putExtra("intent_trav", "780");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_115) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1150");
			intent_reel.putExtra("intent_barrel", "570");
			intent_reel.putExtra("intent_trav", "780");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_120) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1200");
			intent_reel.putExtra("intent_barrel", "570");
			intent_reel.putExtra("intent_trav", "780");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_140) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1400");
			intent_reel.putExtra("intent_barrel", "650");
			intent_reel.putExtra("intent_trav", "830");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_160little) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1600");
			intent_reel.putExtra("intent_barrel", "750");
			intent_reel.putExtra("intent_trav", "930");
			startActivity(intent_reel);
			finish();
		}
		if(v.getId()==R.id.b_160big) {
			Intent intent_reel = new Intent(Wooden_Reels.this, Main_2.class);
			intent_reel.putExtra("intent_flang", "1600");
			intent_reel.putExtra("intent_barrel", "750");
			intent_reel.putExtra("intent_trav", "1210");
			startActivity(intent_reel);
			finish();
		}
		
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent intent_main = new Intent(Wooden_Reels.this, Main.class );
		startActivity(intent_main);
		finish();
	}

}
