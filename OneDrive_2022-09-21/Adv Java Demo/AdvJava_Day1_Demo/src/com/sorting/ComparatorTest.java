package com.sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparatorTest {
	public static void main(String[] args) {
		List<Employee1> el=new ArrayList<>();
		el.add(new Employee1("Ravic", 30));
		el.add(new Employee1("Amit", 21));
		System.out.println("Element befor sorting");
		System.out.println(el);
		Collections.sort(el ,new AgeComparator() );
		System.out.println("Element After sorting by age");
		System.out.println(el);
		Collections.sort(el ,new NameComparator() );
		System.out.println("Element After sorting by name");
		System.out.println(el);



	}

}
