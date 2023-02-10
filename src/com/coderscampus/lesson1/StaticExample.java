package com.coderscampus.lesson1;

public class StaticExample {
	
	// static = belongs to the class, not the instance of the class
	// non-static = belongs to an instance of the class (not the class itself)
	
	int someNumber = 10;

	public static void main(String[] args) {
		StaticExample staticObject = new StaticExample();
		
		if (staticObject.someNumber > 11) {
			System.out.println("say something");
		}
		
		
		// ------ //
		// CAN DO //
		// ------ //
		// new instance of the Human is created giving you the ability to have access
		// to getStageOfLife instance method
		Human aChild = new Human();
		aChild.age = 12;
		Human bChild = new Human();
		bChild.age = 40;
		System.out.println("age is 12 - " + aChild.getStageOfLife());
		System.out.println("age is 40 - " + bChild.getStageOfLife());
		
		// ---------- //
		// CAN-NOT DO //
		// ---------- //
//		Human.getStageOfLife();
		
		// ------ //
		// CAN DO //
		// ------ //
		// (Human) This is not an instance, this is the class itself referencing class variables (static)
		if (Human.ADULT_AGE < 10) {
			System.out.println("do something...");
		}
		
		

		

	}

}
