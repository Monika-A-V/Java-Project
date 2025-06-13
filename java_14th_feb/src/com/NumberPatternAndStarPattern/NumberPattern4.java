package com.NumberPatternAndStarPattern;

        //1 2 3 4
		//1 2 3
		//1 2
		//1
		//1
		//1 2
		//1 2 3
		//1 2 3 4

public class NumberPattern4 {

	public static void main(String[] args) {


				for(int i=4;i>=1;i--)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
				}
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(j + " ");
					}
					System.out.println();
				}

			}}

