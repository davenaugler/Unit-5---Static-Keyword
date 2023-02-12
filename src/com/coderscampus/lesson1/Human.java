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
	
	
	// Getting will return you the value (this is a method)
	public int getAge() {
		return age;
	}
	
	// Setting - will change the value (this is a method)
	public void setAge(int age) {
		if (age < 0 || age > 130) {
			System.out.println(age + ", is not a valid age. A valid age is between 0 and 130");
			return;
		}
		this.age = age;
	}
	
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
