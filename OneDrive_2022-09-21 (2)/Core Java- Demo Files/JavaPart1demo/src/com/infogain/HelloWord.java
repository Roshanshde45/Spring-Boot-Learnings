package com.infogain;
public class HelloWord {
	public static void main(String[] args) {
		String name=args[0];
	    String dept=args[1];
		int eid=Integer.parseInt(args[2]);
	//	int eid= args[0];
		float sal=2345.89F;
		
		
	System.out.println("***Employee Details***"+ eid);
	System.out.println("Eid "+eid+" Name "+name+" Dept " +dept);

	}

}
