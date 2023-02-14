package com.coderscampus.lesson3;

// POJO - Plain Old Java Object
public class User {
	// instance variables (declared as private)
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int accountNumber;
	private int unsuccessfulLoginAttempts;
	
	// getters and setters for the above instance variables
	// username
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	// password
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// firstName
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// lastName
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// accountNumber
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	// unsuccessfulLoginAttempts
	public int getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}
	
	public void setUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}
	
	
	
	
	
}
