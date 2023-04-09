package com.ExceptionHandlingDemo;

public class NestedTryCatchThrows 
{
   public static void main(String[] args) throws Exception
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
				throw new ArithmeticException();
			}
		}
			catch(ArithmeticException e)
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
