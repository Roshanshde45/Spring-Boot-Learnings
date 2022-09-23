package com.infogain.overloading;

public class ConstructorOverlaoding {

public static void main(String[] args) {
	
	Employee emp=new Employee(101);
	System.out.println(emp.getEmpId());
	Employee emp1=new Employee(102,"Ravic");
	System.out.println(emp1.getEmpId()+" "+emp1.getName());
	Employee emp2=new Employee(102,"Ravic",5000);
	System.out.println(emp2.getEmpId()+" "+emp2.getName()+" Sal "+emp2.getSalary());

	}

}
