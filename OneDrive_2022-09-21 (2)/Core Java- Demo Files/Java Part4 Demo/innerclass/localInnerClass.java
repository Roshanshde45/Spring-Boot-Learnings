package com.infogain.innerclass;

public class localInnerClass 
{
 private double price=10.5;  //outer class field
 public void area( int x, int y) //outer class method
 {
	 class Inner //Inner Class inside method
	 {
	 public void perimeter()
	 {
		 System.out.println("x is"+ x);
		 System.out.println("y is"+ y);
		 int z=x+y;
		 System.out.println("Perimeter is"+z);
		 System.out.println("Price: "+ price);
	 }
	 }//end of inner class
	 
	 Inner  s1=new Inner();
	 s1.perimeter();
 } //area closes

    public static void main(String[] args) 
    {
    	localInnerClass f1=new localInnerClass();
    	f1.area(10, 30);
	}

}//end of outer class

