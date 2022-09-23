package com.infogain.serialization;
import java.io.*;
public class SerializationDemo {
	public static void main(String[] args) {
          		try{
			
	Employee E1= new Employee("Ram", 1,21);
	Employee E2= new Employee("Riya", 2,23);
			
	ObjectOutputStream o = new ObjectOutputStream(
					new FileOutputStream("resources/test.txt"));
			o.writeObject(E1);
			o.writeObject(E2);
			System.out.println("****Serailaized objects*****");
			System.out.println(E1);
			System.out.println(E2);
			o.flush();
			o.close();
		}catch(Exception E){
			E.printStackTrace();
		}

		
		try{
	ObjectInputStream o = new ObjectInputStream(
		new FileInputStream("resources/test.txt") );
		
			System.out.println("****Deserailaized objects*****");
	Employee employee1;
	while ((employee1 = (Employee) o.readObject()) != null) {
		System.out.println(employee1);
			}
						
		}catch(Exception E){
			
		}
	}

}
