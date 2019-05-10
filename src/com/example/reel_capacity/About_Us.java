package com.example.reel_capacity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class About_Us extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		Intent intent_main = new Intent(About_Us.this, Main.class );
		startActivity(intent_main);
		finish();
	}

}
