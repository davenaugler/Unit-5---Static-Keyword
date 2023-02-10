package com.coderscampus.lesson1;

public class Human {
	//class variables - belongs to the class, not the instance of the class
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	
	// instance variable - belongs to an instance of this class
	// if 'int age' is set to 'private' then it can only be accessed 
	// within the scope of it's own class
	private int age;
	
	// non-static method - belongs to an instance of the class
	public String getStageOfLife () {
		if (age < TEENAGER_AGE) {
			return "Child";
		} else if (age < ADULT_AGE) {
			return "Teenager";
		} else if (age < SENIOR_AGE) {
			return "Adult";
		} else {
			return "Senior";
		}
	}
	
}
