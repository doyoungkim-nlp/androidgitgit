package com.codepath.example.customadapterdemo;

import java.util.ArrayList;

public class User {

	//declare private data instead of public to ensure the privacy of data field of each class
	private String name;
	private String phone;

	public User(String name, String phone) {
		this.name = name;
		this.phone= phone;
	}

	//retrieve user's name
	public String getName(){
		return name;
	}

	//retrieve users' hometown
	public String getPhone(){
		return phone;
	}

	public static ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Harry", "01028361731"));
		users.add(new User("Marla", "01055485965"));
		users.add(new User("Sarah", "01055886241"));
		users.add(new User("Kevin", "01087452145"));
		users.add(new User("Mark", "01098745632"));
		users.add(new User("James", "01087954788"));
		users.add(new User("Larry", "01087526698"));
		users.add(new User("Maria", "01057948164"));
		users.add(new User("Coner", "01078966665"));
		users.add(new User("Kate", "01077844478"));
		users.add(new User("Lisa", "01089744478"));
		users.add(new User("Anne", "01099444778"));
		users.add(new User("Louis", "01099642211"));
		users.add(new User("Will", "01099745411"));
		users.add(new User("William", "01099733331"));
		return users;
	}
}
