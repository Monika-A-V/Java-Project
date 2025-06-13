package com.JavaDemo;

class Invalidsumexception extends Exception
{
	Invalidsumexception(String string)
	{
		super();
	}
}

public class Demo
{
	public void valid() throws Invalidsumexception
	{
	String s="monika1235";
	int sum=0;

	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c>='0' && c<='9')
		{
			int digit=Character.getNumericValue(c);
			sum=sum+digit;
		}}
	    System.out.println(sum);
	
			if(sum<10)
			{
				throw new Invalidsumexception("invalid sum");
			}
			else
			{
				System.out.println("valid sum");
			}
	}
public static void main(String[] args) 
	{
		Demo d=new Demo();
		try
		{
			d.valid();
		}
		catch(Invalidsumexception i)
		{
			System.out.println(i);
		}
	
	
}}