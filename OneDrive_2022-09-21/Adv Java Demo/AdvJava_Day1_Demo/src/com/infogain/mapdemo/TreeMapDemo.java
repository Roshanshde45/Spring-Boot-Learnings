/**
 * 
 */
package com.infogain.mapdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Saurabh1.Mishra
 * 
 */
public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creates a TreeMap object
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("Rohit", "A++");// insert an entry inside Treemap
		tm.put("Amit", "A");
		tm.put("David", "B");
		// returns set view containing all the key
		Set<String> s = tm.keySet();
		// return the iterator
		Iterator<String> itr = s.iterator();
		// loop through all the key and value
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println("Name " + key + "Grade " + tm.get(key));
		}

	}
}
