package com.coderscampus.lesson8;
// In this lesson we learn about the "args" in "(String[] args) and how to use and apply arguments using a for each loop.

// In this lesson I learned out to pass arguments into a java program.
// Learned what "(String[] args)" really means and how it can be used
// And learning how to use the .split method
// Learned how to make and use a java for each loop


public class StringManipulation {

	// public - is an access modifier that allows this method to be accessed
	// publicly,
	// if it was private then it would only be viewable within the class.

	// static - belongs to the class itself not an instance of the class,
	// it can be accessible by an instance of a class.

	// void - return type. It's returning nothing

	// main - name of the method. This method is special and requires the name
	// "main"
	// for it to run the code properly.

	// (String[] args) - an array of strings. The length of the array is not being
	// defined here
	// because we are not instantiating it. It wants a data type "(String[]" and a
	// variable name
	// for that data type "args)"

	public static void main(String[] args) {
		// Java for each loop
		for (String arg : args) {
			System.out.println(arg);
			// 1,2,3,4,5,6,7,8,9 -> [0] = "1", [1] = "2", ...
			String[] numbersArray = arg.split(",");
			for (String number : numbersArray)
			System.out.println(number);
			
		}
		
		

	}

}


