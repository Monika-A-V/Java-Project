package com.ClassAndObject;

public class FactorsOfNumber 
{
	
	public void numberFactors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);			}
		}
	}

	public static void main(String[] args) 
	{
		FactorsOfNumber f=new FactorsOfNumber();
		f.numberFactors(12);

	}

}
