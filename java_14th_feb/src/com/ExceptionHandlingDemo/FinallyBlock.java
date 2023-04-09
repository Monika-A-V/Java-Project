package com.ExceptionHandlingDemo;

public class FinallyBlock {

	public static void main(String[] args) {

		try
		{
			System.out.println("hii");
			int x=10/0;
			System.out.println(x);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("i am finally block");
		}
		System.out.println("hiiiiii");
	}

}
