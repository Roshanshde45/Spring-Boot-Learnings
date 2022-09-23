package com.infogain;
import java.util.Scanner;
public class Employee {
	int eId;//instance variable
	String name;
    static String msg="Infogain";//static /class level variable
	float sal;
	static void greet()
	{
		System.out.println("Welcome to "+ msg);
	}
	
	void get()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	name=sc.nextLine();
	
	System.out.println("Enter Id");
	eId=sc.nextInt();
	
	System.out.println("Enter Salary");
	sal=sc.nextFloat();
	
    }
	void printInfo()
	{
		int bonus=2000;//local variable
		float totalsal=sal+bonus;
		System.out.println("***Emp Details****");
        System.out.println("Eid "+eId+" name "+name+""
		+"Total Sal "+totalsal);
	}
}
