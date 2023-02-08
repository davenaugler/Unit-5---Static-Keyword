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

	}

}
