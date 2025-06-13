package com.ExceptionHandlingDemo;

public class NestedTryCatch {

	public static void main(String[] args) 
	{
		int count=0;
		
		try
		{
			try
			{
			count++;
			try
			{
				count++;
				throw new Exception();
			}
			catch(Exception e)
			{
				count++;
				throw e;
			}
		}
			catch(Exception e)
			{
				count++;
				throw e;
			}
		  }
	      catch(Exception e)
	     {
		System.out.println(count);
	}
	}
	}
