package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Ravic");
		al.add("Amit");
		al.add("Mohit");
		System.out.println("Unsorted Elements");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Sorted Elements");
		System.out.println(al);
		/*Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorted Elements in reverse order");*/
		Collections.reverse(al);
		System.out.println("Elements after reversing ");
		System.out.println(al);
		}

}
