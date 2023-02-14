package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		// Arrays allow us to store multiple objects (or primitives) into 
		// ONE variable - Note: an Array is one type of Data Structure
		
		User[] users = new User[13];
		for (int i = 0; i < 13; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1));
		
		}
		System.out.println(users);
		
//		users[0] = userService.createUser("user1", "password1");
//		users[1] = userService.createUser("user2", "password2");
//		users[2] = userService.createUser("user3", "password3");
//		users[3] = userService.createUser("user4", "password4");
//		users[4] = userService.createUser("user5", "password5");
//		users[5] = userService.createUser("user6", "password6");
//		users[6] = userService.createUser("user7", "password7");
//		users[7] = userService.createUser("user8", "password8");
//		users[8] = userService.createUser("user9", "password9");
//		users[9] = userService.createUser("user10", "password10");
//		users[10] = userService.createUser("user11", "password11");
//		users[11] = userService.createUser("user12", "password12");
//		users[12] = userService.createUser("user13", "password13");
//		

	}

}
