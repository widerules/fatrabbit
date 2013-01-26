package com.example.fatrabbit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Rabbit_MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rabbit__main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_rabbit__main, menu);
		return true;
	}

}
