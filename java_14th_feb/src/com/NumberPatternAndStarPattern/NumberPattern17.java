package com.NumberPatternAndStarPattern;

//1 3 5 7 9
//3 5 7 9 1
//5 7 9 1 3
//7 9 1 3 5
//9 1 3 5 7

public class NumberPattern17
{
   public static void main(String[] args) 
    
   {
		for(int i=1;i<=9;i=i+2)
		{
			for(int j=i;j<=9;j++)
			{
				if(j%2!=0)
				{
				System.out.print(" "+j);
			}
			}
				for(int k=1;k<i;k++)
			{
				if(k%2!=0)
				{
					System.out.print(" "+k);
				}
			}
			System.out.println();
		}

	}

}
	
