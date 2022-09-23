/**
 * 
 */
package com.infogain.overriding;

/**
 * @author Saurabh1.Mishra Date:26/7/2016 Purpose :Demonstrate Method Overriding
 * 
 */
// Inheritance
public class RegularEmplyoee extends Employee {
	double salary;
// Overriding
	public String getDetail() {
		System.out.println("********After Overriding*********");
		System.out.println(super.getDetail());
		return "Salary: " + salary;
	}

}
