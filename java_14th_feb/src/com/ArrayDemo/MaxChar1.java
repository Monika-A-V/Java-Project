package com.ArrayDemo;

public class MaxChar1
{
	public static void maxChar(char[] c)
	{
		char mchar=c[0];
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" "+((int) c[i]));
			if(mchar<c[i])
			{
				mchar=c[i];
			}
		}
			System.out.println(mchar);
		}
		
	public static void main(String[] args) 
	{
		char ch[]= {'X','u','Z','v'};
		MaxChar1.maxChar(ch);

	}

}
