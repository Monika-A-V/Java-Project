package com.ExceptionHandlingDemo;

class AgeValidateException extends Exception
{
	public AgeValidateException()
	{
		System.out.println("invalid age");
	}
	public AgeValidateException(String msg)
	{
		super(msg);
		
	}
}
public class CustomDemo
{
	public static void valid(int age) throws AgeValidateException
	{
		if(age < 18)
		{
			throw new AgeValidateException("age must greater than 18");
		}
		else
		{
			System.out.println("age is invalid");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			valid(10);
		}
		catch(AgeValidateException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
}

}

