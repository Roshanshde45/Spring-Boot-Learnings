package com.infogain.array;

import java.util.Scanner;

public class Employee {
	int eid;
	String name;
	String dept;
	
public Employee(int eid,String name,String dept) {
	this.eid=eid;
	this.name=name;
	this.dept=dept;
}

public static Employee createEmployee() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the name");
	String nm=sc.nextLine();
	System.out.println("Enter the dept");
	String d=sc.nextLine();
	System.out.println("Enter the eid");
	int id=sc.nextInt();
	Employee e=new Employee(id,nm, d); // Named object
	//return new Employee(id,nm, d); // Unnamed/Annoymous object
	return e;
	
}


public void printInfo() {
	System.out.println("Eid "+eid+" Name "+name+" Dept "+dept);
}
	
	
}
