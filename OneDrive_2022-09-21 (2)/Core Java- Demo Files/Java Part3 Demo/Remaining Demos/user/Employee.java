package com.infogain.user;

public class Employee {
	
	private static void greet() 
	{
		System.out.println("Private-Welcome to Infogain");
	}
	
	static void show()
	{
		System.out.println("Default Access specifier");
	}
	
	
	static protected void disp()
	{
		System.out.println("Protected Access specifier");
	}
	
	static public void msg()
	{
		System.out.println("Public Access specifier");
	}
	
	public static void main(String args[])
	{
		greet();
		show();
		disp();
		msg();
		
	}
}
