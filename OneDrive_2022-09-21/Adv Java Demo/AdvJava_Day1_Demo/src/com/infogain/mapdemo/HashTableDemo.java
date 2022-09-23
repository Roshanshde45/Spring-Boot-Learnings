/**
 * 
 */
package com.infogain.mapdemo;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
/**
 * @author Saurabh1.Mishra
 * 
 */
public class HashTableDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* declares HashTable having state and capital */
		Hashtable<String, String> htable = new Hashtable<String, String>();
		/* Adding elements to HashTable */
		htable.put("Hayrana", "Chandigarh");
		htable.put("Delhi", "Delhi");
		/* Exception at run time */
		// htable.put(null, "Kolkata");

		/* Display content using Iterator */
		Set<String> set = htable.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("State is: " + key + " & Capital is: "
					+ htable.get(key));

		}
		/* Display content using Enumeration */
		// Enumeration<String> my = htable.elements();
		Enumeration<String> my = htable.keys();
		while (my.hasMoreElements()) {
			String key = my.nextElement();
			System.out.println(key + " " + htable.get(key));
		}

	}

}
