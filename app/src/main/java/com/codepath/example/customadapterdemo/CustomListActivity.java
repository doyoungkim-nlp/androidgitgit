package com.codepath.example.customadapterdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_list);//res->layout->activity_custon_list.xml layout을 불러온다고 한다
		populateUsersList();
	}

	private void populateUsersList() {
		// Construct the data source 초기화 컴포넌트같은 느낌
		ArrayList<User> arrayOfUsers = User.getUsers();
		// Create the adapter to convert the array to views
		CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
		// Attach the adapter to a ListView
		ListView listView = (ListView) findViewById(R.id.lvUsers);
		listView.setAdapter(adapter);
	}
	
}
