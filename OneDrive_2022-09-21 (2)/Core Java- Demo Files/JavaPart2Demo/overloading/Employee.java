package com.infogain.overloading;

public class Employee {
	int empId;
	String name;
	double salary;
	
	public Employee(int empId) {
		this.empId=empId;
	}
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
