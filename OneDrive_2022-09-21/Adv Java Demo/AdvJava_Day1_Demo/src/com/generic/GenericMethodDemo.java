package com.generic;
public class GenericMethodDemo {
	// declares a generic method
	public static <E> void printArray(E[] elements) {
		// for each loop for displaying the elements
		for (E el : elements) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		// Initialize an array of integer
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		// Initialize an array of integer
		Character[] charArray = { 'J', 'A', 'V', 'A' };
		System.out.println("Printing Integer Array");
		printArray(intArray);// calling the generic method
		System.out.println("Printing Character Array");
		printArray(charArray);
	}
}
