package com.infogain;

public class EmpMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Employee e;
		e=new Employee();
		e.get();
		Employee.greet();
		//e.greet();
		e.printInfo();
		System.out.println(" Main End");

	}

 }
