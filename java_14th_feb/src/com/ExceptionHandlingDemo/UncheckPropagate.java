package com.ExceptionHandlingDemo;

public class UncheckPropagate 
{
	static void m1()
	{
		try 
		{
		throw new NullPointerException("my null value");
		
	}
	    catch (NullPointerException e)
	{
	    	e.printStackTrace();
		   System.out.println(e);
	}
}
   static void n1()
   {
	  m1();
   }
   static void p1()
   {
	   n1();
   }
	public static void main(String[] args) 
	{
		p1();
		System.out.println("hello");
		

		
	}

}
