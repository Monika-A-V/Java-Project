package com.ExceptionHandlingDemo;


class InvalidPassException extends Exception
{
	InvalidPassException(String str)
	{
		super(str);
	}	
}
public class InvalidPasswordException 
{
	public static void valid(String s) throws InvalidPassException
	{
		int a[]=new int[s.length()];
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			a[i]=s.charAt(i);
			if(a[i]>='0' && a[i]<='9')
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("your pass is "+s);
		}
		else
		{
			throw new InvalidPassException("pass atleast contain one digit");
		}
		
	}

	public static void main(String[] args) 
	{
		String s="monika@123";
		try
		{
			valid(s);
		}
		catch(InvalidPassException e)
		{
			System.out.println(e);
		}

	}

}
