package com.AlphabetPattern;

/*
A 
A B 
A B C 
A B C D 

*/
public class AlphabetPattern3 {

	public static void main(String[] args)
	{
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
		
		System.out.println();
		}
	}

}
