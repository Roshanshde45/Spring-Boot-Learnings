package com.infogain.inheritance;

public class HirerchicalInh {

	public static void main(String[] args)
	{
		RegularEmployee reg=new RegularEmployee(101, "Ravic", 5000, 500000);
		WeeklyPaidEmployee wemp=new WeeklyPaidEmployee(102, "Amita", 5000, 40000);
        reg.printDetails();
        wemp.printDetails();
	}

}
