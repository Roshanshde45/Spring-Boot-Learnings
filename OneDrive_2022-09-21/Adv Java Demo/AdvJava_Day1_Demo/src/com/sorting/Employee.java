package com.sorting;

public class Employee implements Comparable<Employee> {
	int eId;
	String name;
	int age;
public Employee(int eId,String name,int age) {
	this.eId=eId;
	this.name=name;
	this.age=age;
}

public String toString()
{
	return eId+" "+name+" "+age;
}

@Override
public int compareTo(Employee o) {
if(this.age==o.age)
{
	return 0;
}
else if(this.age>age)
{
	return 1;
}
else return -1;
}

}
