package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserService {
	// Services provide helpful functionality in the way of methods
	
	public User createUser (String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
		
	}
	
	
}
