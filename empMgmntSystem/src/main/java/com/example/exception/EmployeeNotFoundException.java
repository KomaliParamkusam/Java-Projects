package com.example.exception;

public class EmployeeNotFoundException extends RuntimeException
{

	public EmployeeNotFoundException(Long id) {
		super("Employee with id: "+id+" is not found");
	}
	
}
