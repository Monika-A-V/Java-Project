package com.ExceptionHandlingDemo;

public class CheckBinary {

	public static void main(String[] args) {

		String s="1010101";
		boolean isBinary=true;

		try
		{
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c!='1' && c!='0')
				{
					isBinary=false;
					throw new Exception("String is not binary");
				}
			}
			if(isBinary)
			{
		
				System.out.println("string is binary");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
