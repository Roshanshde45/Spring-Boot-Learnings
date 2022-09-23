package com.infogain.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class JobHashMap {
	public static void main(String args[]) {

		/* This is how to declare HashMap having JOB_ID and JOB_TITLE */
HashMap<String, String> hmap = new HashMap<String, String>();

//HashMap allow single null key but multiple null values
	/* Adding elements to HashMap */
		hmap.put("SA_REP", "Sales Representative");
		hmap.put("FI_ACCOUNT", "Accountant");
		hmap.put("SA_MAN", "Sales Manager");
		hmap.put("IT_PROG", "Programmer");
		hmap.put(null, "Finance Manager");
		

		/* Get values based on key */
		String jobTitle = hmap.get("FI_ACCOUNT");
		System.out.println("Value at FI_ACCOUNT is: " + jobTitle);


		// Iterate over HashMap
for (String key : hmap.keySet()) {
System.out.println(key + " :: " + hmap.get(key));
				}
		/* Display content using Iterator */
		Set<String> set = hmap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key is: " + key + " & Value is: "
					+ hmap.get(key));

		}


/*		 Remove values based on key 
		hmap.remove("FI_ACCOUNT");

		System.out.println(hmap.keySet());
		System.out.println(hmap.values());

		String searchKey = "SA_MAN";

		if (hmap.containsKey(searchKey))

			System.out.println("Found Job Title " +hmap.get(searchKey)
					+ " with Job id "
					+ searchKey );
		// Clear all values.

		hmap.clear();

		// Equals to zero.

		System.out.println("After clear operation, size: "
				+ hmap.size());

		
*/	}

}
