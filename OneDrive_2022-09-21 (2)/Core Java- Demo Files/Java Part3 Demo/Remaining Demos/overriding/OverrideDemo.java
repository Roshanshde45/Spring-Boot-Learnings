/**
 * 
 */
package com.infogain.overriding;

/**
 * @author Saurabh1.Mishra Date:26/july/2016
 * 
 */
public class OverrideDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.firstName = "Divya";
		employee.lastName = "Khare";
//System.out.println(employee.getDetail());
	RegularEmplyoee rEmplyoee = new RegularEmplyoee();
		rEmplyoee.firstName = "kabir";
		rEmplyoee.lastName = "Johri";
		rEmplyoee.salary = 50000;
		
		System.out.println(rEmplyoee.getDetail());

	}

}
