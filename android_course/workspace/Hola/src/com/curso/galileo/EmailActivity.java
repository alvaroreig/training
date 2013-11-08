package com.curso.galileo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class EmailActivity extends ListActivity implements OnClickListener {
	private final static String EMAIL = "email";
	private final static String DATE_ADDED = "date";
	private List<HashMap<String,String>> emails = new ArrayList<HashMap<String,String>>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_email_list);
		
		Button btnAdd = (Button) findViewById(R.id.btnAdd);
		btnAdd.setOnClickListener(this);
		
		SimpleAdapter adapter = new SimpleAdapter(this, 
				emails, 
				android.R.layout.simple_list_item_2, 
				new String[]{EMAIL,DATE_ADDED}, 
				new int[]{android.R.id.text1,android.R.id.text2});
		
		setListAdapter(adapter);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	


}