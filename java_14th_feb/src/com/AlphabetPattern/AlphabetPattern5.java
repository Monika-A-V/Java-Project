package com.AlphabetPattern;

public class AlphabetPattern5 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print(j +" ");
				}
				else
				{
					System.out.print((char)(j+64) + " ");
				}
			}
			System.out.println(" ");
		}
	}
}
		
		/*for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
			System.out.print(i + " ");
		}
			System.out.println();
		
		for (char c = 'A'; c <= 'B'; c++) 
		{
		  System.out.print(c + " ");
		}
		System.out.println();

	
		for (int q = 1; q<= 3; q++) 
		{
		  System.out.print(q + " ");
		}
		System.out.println();

		
		for (char c = 'A'; c <= 'D'; c++)
		{
		  System.out.print(c + " ");
		}
		System.out.println();
	}*/
		
	