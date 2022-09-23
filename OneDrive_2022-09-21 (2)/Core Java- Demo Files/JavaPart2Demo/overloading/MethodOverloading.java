package com.infogain.overloading;

public class MethodOverloading {
	
	float calculateSalary(int days,float salPerDay) {
		return days*salPerDay;
	}
	
	float calculateSalary(int days,float salPerDay,float bonus) {
		return days*salPerDay+bonus;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m=new MethodOverloading();
		System.out.println("Salary without Bouns "+m.calculateSalary(30,2000));
		System.out.println("Salary with Bouns "+m.calculateSalary(30,2000,5000));
		
		
		

	}

}
