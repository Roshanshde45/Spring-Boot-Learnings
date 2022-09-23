package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101, "Ravic", 30));
		al.add(new Employee(102, "Amit", 21));
		System.out.println("Element befor sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Element After sorting");
		System.out.println(al);
	}

}
