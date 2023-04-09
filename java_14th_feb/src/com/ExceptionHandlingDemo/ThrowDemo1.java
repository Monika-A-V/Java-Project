package com.ExceptionHandlingDemo;

public class ThrowDemo1 {
	
	public static void check(int n)
	{
		if(n<18)
		{
			throw new ArithmeticException("invalid number");
		}
		else
		{
			System.out.println("your age is right");
		}
		
	}

	public static void main(String[] args)
	{

		try
		{
			ThrowDemo.check(21);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		
	}

}
