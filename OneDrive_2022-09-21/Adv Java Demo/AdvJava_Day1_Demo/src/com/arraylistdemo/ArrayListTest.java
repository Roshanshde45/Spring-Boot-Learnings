package com.arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//ArrayList creation storing and retrieval
public class ArrayListTest {
public static void main(String[] args) {
List<String> al=new LinkedList<>();// 
	//ArrayList<String> al=new ArrayList<> ();
		al.add("Ravic");
		al.add("Amit");
		al.add("Mohit");
	//	al.add(23);
	String str= al.get(0);
 System.out.println(al.get(1));
System.out.println(str);
System.out.println("Printing Element using For loop ");
    for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i)+" ");
}
    
 System.out.println("Printing Element using Foreach loop ");
 for(String s:al)
{
	System.out.println(s+" ");
}
	
	
	
	 System.out.println("Printing Element using Iterator loop ");
	 
	 Iterator<String> itr=al.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	
		
		
	/*System.out.println("Printing Element using ListIerator loop ");
	 
	 ListIterator<String> lstr=al.listIterator();
	 while(lstr.hasPrevious())
	 {
		 System.out.println(lstr.previous());
	 }
	
		}*/
	}	

}
