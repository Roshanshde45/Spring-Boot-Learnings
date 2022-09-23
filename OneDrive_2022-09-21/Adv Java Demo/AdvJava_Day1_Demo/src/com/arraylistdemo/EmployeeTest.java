package com.arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeTest {
	public static void main(String[] args) {
	ArrayList<Employee>	al=new ArrayList<>();
	al.add(new Employee(101, "Ravic"));
	al.add(new Employee(102, "Mohit"));
	al.add(new Employee(103, "Aditya"));
	for(Employee e:al)
	{
		e.print();
	}
Iterator<Employee> it=al.iterator();
while(it.hasNext())
{
	Employee ea=it.next();
	ea.print();
}
	}

}
