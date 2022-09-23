package com.infogain.innerclass;

class Company 
{
  private int total=1000; //total emp in org
  //Member Inner class
   class Hr
  {
	  int hremp= 100; //No of HR emp on Org.
	  void show()
	  {
		  System.out.println("Total no of emp"+ total);
		  System.out.println("Hr Count"+ hremp);
	  }
  }//end of inner class
}
class MemberInnerClass
{
	public static void main(String[] args) 
	{
	 Company hc= new Company();
	 Company.Hr h= hc.new Hr();
	 h.show();
	 
	 Company.Hr h1= new Company().new Hr();
	 h1.show();
	 
	 new Company().new Hr().show();
	 
	}

}

