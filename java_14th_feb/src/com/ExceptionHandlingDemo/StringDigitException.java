package com.ExceptionHandlingDemo;

class StringContainsDigitException extends Exception
{
	StringContainsDigitException(String msg)
	{
		super(msg);
	}
	
}
public class StringDigitException {

	public static void main(String[] args) 
	{
		String str="hello33";
		try {
			boolean containDigit=false;
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				if(c>='0' && c<='9')
				{
					containDigit=true;
					throw new StringContainsDigitException("the string contains a digit");
				}
			}
			if(!containDigit)
			{
				System.out.println("does not contain any digit");
	}}
		
		catch(StringContainsDigitException e)
		{
			System.out.println(e.getMessage());
		}

		
	}

}
