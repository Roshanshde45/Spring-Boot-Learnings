package com.infogain.innerclass;

public class AnoymousDemo {

	public static void main(String[] args) 
	{
		new Shape()
		{
			@Override
			public void draw() 
			{
				System.out.println("Anon Class: Inside the circle");				
			}
			
			
		}.draw();
		
		new Shape()
		{
			@Override
			public void draw() 
			{
				System.out.println("Anon Class: Inside the triangle");				
			}
		}.draw();
		new Shape()
		{
			@Override
			public void draw() 
			{
				System.out.println("Anon Class: Inside the rectangle");				
			}
		}.draw();
	}

}
