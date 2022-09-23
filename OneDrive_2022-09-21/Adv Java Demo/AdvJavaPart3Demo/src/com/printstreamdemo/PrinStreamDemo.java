package com.printstreamdemo;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
public class PrinStreamDemo {
public static void main(String[] args)throws Exception {
// Creating standard outputstream
PrintStream ps = new PrintStream(System.out,true);
     //  Print
 ps.println("This is example for PrintWriter!!");
      int eid = 15;
	  float sal = 20000.0f;
	String name="Ravic";
	 ps.printf("Eid = %d , name %s and salary is   %f", eid, name,sal);
				 	       
 FileOutputStream fout=new FileOutputStream("./testout.txt ");    
  PrintStream pout=new PrintStream(fout);  
 	      pout.println(eid);
  	     pout.println(name);
 	    pout.println(sal);
 	    pout.flush();
	   pout.close();
				 	    System.out.println("\n");
				 	    System.out.println("Data written on file sucessfully");
				 	 
		 
	}

}
