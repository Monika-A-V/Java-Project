package com.OOPS;


class SuperClass 
{
	   SuperClass get()
	   {
	      System.out.println("SuperClass");
	      return this;
	   }
	}
class Tester extends SuperClass 
{
	   Tester get() 
	   {
	      System.out.println("SubClass");
	      return this;
	   }
}
public class CovarientDemo
{

	public static void main(String[] args)
	{
		 SuperClass tester = new Tester();
	     tester.get();
		
	}

}
