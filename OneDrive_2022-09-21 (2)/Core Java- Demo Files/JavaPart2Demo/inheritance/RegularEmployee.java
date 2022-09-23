package com.infogain.inheritance;

public class RegularEmployee extends Employee{
	double salary;
	public RegularEmployee(int employeeId, String name, float commissionPerct, double salary) {
		super(employeeId, name, commissionPerct);
		this.salary = salary;
	}
	
	public void printDetails() {
		System.out.println("*****Regular Emp Details*****");
		System.out.println(employeeId+" "+name+" "+salary+" "+commissionPerct);
	}
	
	

}
