package com.NumberPatternAndStarPattern;

//1 3 5 7 9
//3 5 7 9
//5 7 9
//7 9
//9
public class NumberPattern16
{

	public static void main(String[] args)
	{
	 for(int i=10;i>=1;i=i-2)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 if(j%2!=0)
			 {
				 System.out.print(j);
			 }
		 }
	 
      System.out.println();
      
	}

}}
