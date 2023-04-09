package com.ExceptionHandlingDemo;

public class HandleDemo {

	public static void main(String[] args) {

		System.out.println("hello");
		
		try
		{
			int x=10;
			int ans=x/0;
			System.out.println(ans);
		}
		catch(Exception e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("welcome to java");
		
		System.out.println(10*4);
	}

}
