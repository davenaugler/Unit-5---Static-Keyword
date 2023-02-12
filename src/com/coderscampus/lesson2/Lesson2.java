package com.coderscampus.lesson2;

import com.coderscampus.lesson1.Human;

public class Lesson2 {
	public String someVariable = "Hi, I'm public.";
	private String thePrivateVariable = "I am private!";
	protected String weMustProtectThisHouse = "Protected!";

	// Access modifiers = private, public, protected 
	// Access modifiers are keywords that we can use to change our codes ability to access 
	// classes, methods, and variables 
	
	// The purpose of an Access Modifier is to restrict access to variables and methods, you are
	// changing the way the code can be used, and there we enter abstraction and data hiding
	// A very good example of abstraction and data hiding is a very common use case, we hide
	// instance variables. Adding an access modifier to an instance variable...
	// Abstraction is all about reducing complexity aka hiding certain details that don't need to be accessed.
	public static void main(String[] args) {
		Human daveNaugler = new Human();
//		daveNaugler.age = 36;
//		daveNaugler.setAge(100);
//		System.out.println("Dave is considered a " + daveNaugler.getStageOfLife());
		
		daveNaugler.setAge(-1);
		System.out.println(daveNaugler.getAge());
		daveNaugler.setAge(160);
		System.out.println(daveNaugler.getAge());
		daveNaugler.setAge(36);
		System.out.println(daveNaugler.getAge());
		
		

	} 
	
	
	
	
	
	
	
	
	

	public String getThePrivateVariable() {
		return thePrivateVariable;
	}

	public void setThePrivateVariable(String thePrivateVariable) {
		this.thePrivateVariable = thePrivateVariable;
	}

}
