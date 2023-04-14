package com.ExceptionHandlingDemo;

public class ThrowDemo {
	public static void check(int n)
	{
		try
		{
		if(n<18)
		{
			throw new ArithmeticException("Invalid numberr");
			
		}
		else
		{
			System.out.println("age is right");
		}
		
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		}

	public static void main(String[] args) 
	{
		ThrowDemo.check(12);
		System.out.println("hello throw done");

		
		}
	}