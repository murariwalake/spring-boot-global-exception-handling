package com.murariwalake.springbootglobalexceptionhandling.exception;

public class StudentNotFoundException extends RuntimeException {
	public StudentNotFoundException(String message) {
		super(message);
	}
}
