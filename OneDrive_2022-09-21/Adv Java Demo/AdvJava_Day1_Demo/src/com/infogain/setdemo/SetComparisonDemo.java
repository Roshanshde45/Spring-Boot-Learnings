/**
 * 
 */
package com.infogain.setdemo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetComparisonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	HashSet<String> stringOne = new HashSet<String>();
	LinkedHashSet<String> stringTwo = new LinkedHashSet<String>();
	TreeSet<String> stringThree = new TreeSet<String>();
	String fruitList[] = { "mango", "apple", "banana" };
			for (String fruit : fruitList) {
			stringOne.add(fruit);
			stringTwo.add(fruit);
			stringThree.add(fruit);
		}
		// no ordering in HashSet – elements stored in random order
		System.out.println("Ordering in HashSet :" + stringOne);

		// Maintains insertion order of elements
		// insertion
		System.err.println("Order of element in LinkedHashSet :" + stringTwo);

		// TreeSet stores element in sorted order
		System.out.println("Order of objects in TreeSet :" + stringThree);

		System.out.println("Elements using Iterator");
		
		Iterator<String> itr=stringOne.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
