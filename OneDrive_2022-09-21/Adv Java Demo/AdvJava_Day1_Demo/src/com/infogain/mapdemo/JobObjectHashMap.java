package com.infogain.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JobObjectHashMap {

	public static void main(String args[]) {

		/* This is how to declare HashMap having JOB_ID and JOB_TITLE */
	HashMap<String, Job> hmap = new HashMap<String, Job>();
		// TreeMap<String, String> hmap = new TreeMap<String, String>();

		/* Adding elements to HashMap */
		hmap.put("SA_REP", new Job("Sales Representative", 10000, 100000));
		hmap.put("FI_ACCOUNT", new Job("Accountant", 5000, 50000));
		hmap.put("SA_MAN", new Job("Sales Manager", 15000, 150000));
		hmap.put("IT_PROG", new Job("Programmer", 18000, 120000));
		hmap.put("FI_MGR", new Job("Finance Manager", 20000, 200000));

		/* Display content using Iterator */
		Set<String> set = hmap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("key is: " + key + " & Value is: "
					+ hmap.get(key));

		}

		/* Get values based on key */
		Job job = hmap.get("FI_ACCOUNT");
		System.out.println("Value at FI_ACCOUNT is: " + job.title);

		/* Remove values based on key */
		hmap.remove("FI_ACCOUNT");

		System.out.println(hmap.keySet());
		System.out.println(hmap.values());

	}

}
