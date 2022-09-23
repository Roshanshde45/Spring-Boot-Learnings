package com.infogain.string;

public class StringBufferDemo {

	public static void main(String[] args) {
	StringBuffer str1= new StringBuffer("Amit");
	StringBuffer str2=new StringBuffer("Singh");
	StringBuffer str3=str1; 
		
		str1=str1.append(str2); 
		
		System.out.println(str3+" "+str1);
		


	}

}
