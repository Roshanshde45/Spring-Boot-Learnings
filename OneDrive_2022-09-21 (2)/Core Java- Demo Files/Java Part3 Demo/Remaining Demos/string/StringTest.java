package com.infogain.string;
public class StringTest {
public static void main(String[] args) {
	
	String str1="Amit";
	String str2= "Singh";
	String str3= str1;  //Amit
	
	str1=str1.concat(str2); //AmitSingh
	
	System.out.println(str1+" "+str2+ " "+str3);
	

	}

}
