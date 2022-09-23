package com.infogain.innerclass;

public class StaticInnerDemo {
	private static int y=30;
    static class First
    {
    	public static void cal(int x)
    	{
    		System.out.println("Private member"+ y);
    		System.out.println("Area :" + Math.round(3.14*x*x));
    	}
    }//inner static class ends 
    
	public static void main(String[] args) 
	{
		StaticInnerDemo.First.cal(3);
	}
} //end of outer class
