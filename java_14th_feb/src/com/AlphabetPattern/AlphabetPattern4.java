package com.AlphabetPattern;

/*
D C B A 
D C B 
D C 
D 
*/

public class AlphabetPattern4
{

	public static void main(String[] args)
	{
		for(char i='A';i<='D';i++)
		{
			for(char j='D';j>=i;j--)
			{
				System.out.print(j+" ");
			}
		
		System.out.println();
		}
	}

}
