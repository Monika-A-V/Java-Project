package com.ExceptionHandlingDemo;

public class UncheckPropagate1 {
	
	static void m1()
	{
		
		throw new NullPointerException("my null value");
		
	}
	    
   static void n1()
   {
	  m1();
   }
   static void p1()
   {
	   try {
	   n1();
	   }
	   catch(NullPointerException e)
	   {
		   e.printStackTrace();
		   System.out.println(e);
	   }
   }

	public static void main(String[] args)
	{
		p1();
		System.out.println("hello");

		
	}

}
