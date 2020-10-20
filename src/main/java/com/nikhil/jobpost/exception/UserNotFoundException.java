package com.nikhil.jobpost.exception;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException() {
		super();
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
	
	public UserNotFoundException(String message, Exception e) {
		super(message, e);
	}

}
