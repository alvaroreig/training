package com.galileo.cursoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class CountryDetailActivity extends Activity {
	public static final String COUNTRY = "country";
	private String country="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_country_detail);
		Intent intent = getIntent();
		country = intent.getStringExtra(COUNTRY);
	}

	public String getCountry() {
		return country;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.country_detail, menu);
		return true;
	}

}
