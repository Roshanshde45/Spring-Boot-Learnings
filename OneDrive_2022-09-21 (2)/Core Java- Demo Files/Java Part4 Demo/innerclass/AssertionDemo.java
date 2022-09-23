package com.infogain.innerclass;
import java.util.Scanner;

public class AssertionDemo 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
    System.out.println("Enter working hours between 0 and 40: ");
    try 
    {
    	int value=s.nextInt();
    	assert value>=0 && value<=40: "Invalid Duration Entered";
    	System.out.println("Value is"+ value);
    }
    catch(AssertionError ob)
    {
    	System.out.println(ob.getMessage());
    }
	}
}
