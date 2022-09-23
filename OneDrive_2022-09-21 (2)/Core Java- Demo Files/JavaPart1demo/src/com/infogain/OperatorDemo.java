package com.infogain;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=5;
		System.out.println("add="+(a+b)+"sub="+(a-b));
		a++;
		b--;
		System.out.println(a<b);
		System.out.println(a<b);
		int var1=2,var2=3;
		
		System.out.println(var1&var2);  
		System.out.println(var1|var2);  
		
		System.out.println((a<b)?a:b);  
		int res=2*5+3;
		System.out.println(res);  
		 res=2*(5/3);
		 System.out.println(res);  
	     var1 = 5;
		  var2 = 10;
		  int var3 = ++var1 * var2--;
		  System.out.println(var3);
	}

}
