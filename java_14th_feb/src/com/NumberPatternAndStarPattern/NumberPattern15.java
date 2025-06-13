package com.NumberPatternAndStarPattern;

//9 7 5 3 1
//7 5 3 1
//5 3 1
//3 1
//1
public class NumberPattern15
{

	public static void main(String[] args) 
	{
		for(int i=10;i>=1;i=i-2)
		{
			for(int j=i;j>=1;j--)
			{
				if(j%2!=0)
				{
					System.out.print(j);
				}
			}
			System.out.println();
	

	}

}
}