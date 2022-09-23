package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListTest2 {
	public static void main(String[] args) {
			ArrayList<String> al=new ArrayList<>();
			al.add("Ravic");
			al.add("Amit");
			al.add("Mohit");
			System.out.println("Amit is there "+al.contains("Amit"));
			System.out.println("Total element"+al.size());
			System.out.println("Unsorted Elements");
			System.out.println(al);
			Collections.sort(al);
			System.out.println("Sorted Elements");
			System.out.println(al);
			al.remove("Ravic");
			System.out.println("After removal of element");
			System.out.println(al);
	}

}
