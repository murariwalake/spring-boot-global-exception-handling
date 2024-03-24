package com.murariwalake.springbootglobalexceptionhandling.exception;

public class StudentWithIdAlreadyExistsException extends RuntimeException {
	public StudentWithIdAlreadyExistsException(String s) {
		super(s);
	}
}
