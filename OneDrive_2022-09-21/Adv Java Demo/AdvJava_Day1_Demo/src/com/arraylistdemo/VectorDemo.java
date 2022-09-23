package com.arraylistdemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {
	public static void main(String[] args) {
	 Vector <String> v=new Vector<>();
	 v.add("Amit");
	 v.add("Ravic");
	 System.out.println("Element at first postion "+v.get(0));
	 
	 System.out.println(" Printing elemnt using iterator");
	 Iterator<String> vtr=v.iterator();
	 while(vtr.hasNext())
	 {
		 System.out.println(vtr.next()+" ");
	 }
	 System.out.println(" Printing elemnt using enumeratioin");
	
	 Enumeration<String> envtr=v.elements();
	while(envtr.hasMoreElements())
	{
		System.out.println(envtr.nextElement()+" ");
	}
	}

}
