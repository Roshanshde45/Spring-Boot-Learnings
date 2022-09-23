package com.infogain.array;

public class ArrrayofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp[]=new Employee[2]; // Array of object having size 2
		/*
		 * emp[0]= new Employee(101,"Ravic", "HR"); 
		 * emp[1]= new Employee(102,"Amit","IT");
		 */
		
		for(int i=0;i<emp.length;i++) {
			emp[i]=Employee.createEmployee();
		}
		
		System.out.println("Total number of emps "+emp.length);
		System.out.println("Printing Emps");
		for(Employee e:emp) {
			e.printInfo();
			}

	}

}
