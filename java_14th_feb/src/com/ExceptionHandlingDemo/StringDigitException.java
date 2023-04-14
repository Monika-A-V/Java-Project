package com.ExceptionHandlingDemo;

class StringContainsDigitException extends Exception
{
	StringContainsDigitException(String msg)
	{
		super(msg);
	}
	
}
public class StringDigitException
{
	public static void valid(String str) throws StringContainsDigitException
	{
		boolean containDigit=false;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='0' && c<='9')
			{
				containDigit=true;
				throw new StringContainsDigitException("string contains a digit");
			}
		}
		if(!containDigit)
		{
			System.out.println("string does not contain any digit");
}
	}

	public static void main(String[] args) 
	{
		String str="hello";
		try {
			valid(str);
		}
		catch(StringContainsDigitException e)
		{
			System.out.println(e.getMessage());
		}

		
	}

}
