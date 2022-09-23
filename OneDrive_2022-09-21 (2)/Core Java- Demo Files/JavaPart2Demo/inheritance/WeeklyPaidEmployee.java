package com.infogain.inheritance;

public class WeeklyPaidEmployee extends Employee{
	double wagesPerWeek;

	public WeeklyPaidEmployee(int employeeId, String name, float commissionPerct, double wagesPerWeek) {
		super(employeeId, name, commissionPerct);
		this.wagesPerWeek = wagesPerWeek;
	}
	
	public void printDetails() {
		System.out.println("***** Weekly PaidEmployee Details*****");
		System.out.println(employeeId+" "+name+" "+wagesPerWeek+" "+commissionPerct);
	}
	
	

}
