package com.ExceptionHandlingDemo;

class InvalidBinaryException extends Exception 
{
	public InvalidBinaryException(String str)
	{
		super(str);
	}
}
public class CheckBinary
{
	public static void valid(String s) throws InvalidBinaryException
	{
		boolean isBinary=true;

		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!='1' && c!='0')
			{
				isBinary=false;
				throw new InvalidBinaryException("invalid binary number");
			}
		}
		if(isBinary)
		{
	
			System.out.println("number is binary");
		}
	}
	public static void main(String[] args) 
	{

		String s="123";
		boolean isBinary=true;

		try
		{
			valid(s);
		}
		catch(InvalidBinaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}

