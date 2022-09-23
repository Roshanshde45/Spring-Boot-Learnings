package com.infogain.serialization;
import java.io.Serializable;
public class Employee implements Serializable {
	private String name;
	private int empId;
	transient private int age;
	public Employee(String name, int id, int age){
		this.name= name;
		this.empId=id;
		this.age=age;
	}

	public String toString(){
	return "name: "+name+" Id: "+empId+" age:"+age;
}

}
