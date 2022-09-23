package com.infogain.array;
public class ArrayDemo {
public static void main(String[] args) 
{
		/*
		 int arr[]; // declartion 
		 arr = new int[3]; // Memory allocation
		 */
	int arr[] =new int[3];

	int num[]= {30,60,70,80};

	String country[]= {"IND","USA","AUS"};

	arr[0]=10;// Assignment
	arr[1]=20;
	arr[2]=30;


	int sum = arr[0]+arr[1];
	
	System.out.println(" Sum of "+arr[0] +" and  "+arr[1] +" = "+sum);

System.out.println("Printing Elements using for loop");
for(int c=0;c<num.length;c++) {
	System.out.println("Element at "+c+" "+num[c]);
}

System.out.println("Printing country names  using for loop");
for(int c=0;c<country.length;c++) {
	System.out.println("Element at "+c+" "+country[c]);
}


System.out.println("Printing country names  using advanced foreach loop");

for(String c:country)
{
	System.out.println("Country names "+c);
}





}

}
