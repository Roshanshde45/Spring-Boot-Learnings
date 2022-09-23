/**
 * 
 */
package com.sorting;
public class StringComparisonDemo {
	public static void main(String[] args) {
	    String str1 = "Apple";
		String str2 = "Banana";
		//String str3 = "Apple";
		// comparing str1 and str2
		int retval = str1.compareTo(str2);
		System.out.println(retval);
		// prints the return value of the comparison
		if (retval > 0) {
			System.out.println("str1 is greater than str2");
		}

		else if (retval == 0) {
			System.out.println("str1 is equal to str2");
		}

		else {
			System.out.println("str1 is less than str2");
		}

	}

}
