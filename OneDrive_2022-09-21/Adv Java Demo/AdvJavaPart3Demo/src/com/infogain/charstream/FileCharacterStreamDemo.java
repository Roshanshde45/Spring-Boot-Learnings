package com.infogain.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class FileCharacterStreamDemo {
	public static void main(String args[]) throws IOException {
FileWriter fw = new FileWriter("./jobhistory.txt");
String records = "Employee name: Dazy Francis , current job: "
		+ "Info Group of Management - "
		+ "Noida and salary: 1000000"
				+ "Previous job : BlackRock Softwares - Gurgaon:"
				+ " and salary: 60000";

		/*
		 * byte[] data=records.getBytes(); for(int i=0;i<data.length;i++) {
		 * fw.write(data[i]); }
		 */
   System.out.println("Going to Write data on file!!");
		fw.write(records);
		fw.flush();
		fw.close();
		System.out.println("Data  Written on the file!!");	
		System.out.println("Going to read data from file!!");
		FileReader fr = new FileReader("./jobhistory.txt");
		int data = 0;
		while ((data = fr.read()) != -1) {
		char charData = (char) data;
		System.out.print(charData);
		}
		fr.close();
		System.out.println("\n ***No more data to read!!****");
		
	}
			
	}
