package com.infogain.bytestream;
import java.io.BufferedInputStream;
/**
 * @author Saurabh1.Mishra  * 
 * 
 */
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedStreamDemo {
	public static void main(String args[]) throws IOException {
FileOutputStream fos = new FileOutputStream("./EmployeeRecords.txt");
BufferedOutputStream bos = new BufferedOutputStream(fos);
String val1 = "Amit Yadav, HR Manager,DateOfJoining-10/10/2009,"
		+ "Infogain India";
		bos.write(val1.getBytes());
		bos.flush();
		bos.close();
		System.out.println("Data written successfully");
		System.out.println("Reading Data form File....");
		FileInputStream fis=new FileInputStream("./EmployeeRecords.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int data;
		while ((data = bis.read()) != -1) {
			char charData = (char) data;
			System.out.print(charData);
		}
		bis.close();
	}
}
