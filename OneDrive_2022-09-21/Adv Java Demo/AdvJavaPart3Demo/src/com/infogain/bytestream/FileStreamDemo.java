package com.infogain.bytestream;
import java.io.*;
import java.util.Scanner;
public class FileStreamDemo {
	public static void main(String[] args) {
		String content;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your  data ");
	content = sc.nextLine();
		try{
		
FileOutputStream fos = new FileOutputStream("resources/newFile.txt");
			byte[] b = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("Success");
			
		File f = new File("resources/newFile.txt");
		FileInputStream fis = new FileInputStream(f);
		int i =0;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
			
		}
		fis.close();
				
		}catch(Exception E){
			E.printStackTrace();
		}
		}
}
