package com.ExceptionHandlingDemo;

public class TryFinally {

	public static void main(String[] args) 
	{
		try
		{
			int x=10;
			
			int ans=x/0;
			System.out.println(ans);
		}
		finally
		{
		System.out.println("finally");
		}
		System.out.println("hello");


	}

}
