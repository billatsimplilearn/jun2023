package com.simplilearn.groceryStore;


//1:M -> 1 store has many employees
public class Employee {
	private int empId;
	private String empName;
	private String empRole;
	
	
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String empRole) {
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}
	
	

	

	
}

