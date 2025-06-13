package com.NumberPatternAndStarPattern;

		//1 0 1 0 1
		//0 1 0 1 0
		//1 0 1 0 1
		//0 1 0 1 0
		//1 0 1 0 1
		public class NumberPattern13
		{

			public static void main(String[] args)
			{
				for(int i=1;i<=5;i++)
				{
					int value;
					if(i%2==0)    //even
					{
						value=0;
						for(int j=1;j<=5;j++)
						{
							System.out.print(value + " ");
							if(value==0)
							{
								value=1;
							}
							else 
							{
								value=0;
						}
						}}
						else   //odd
							
						{
							value=1;
							for(int j=1;j<=5;j++)
							{
								System.out.print(value + " ");
								if(value==0)
								{
									value=1;
								}
								else
								{
									value=0;
								}
							}
					}
					System.out.println();

		}
		}}
	
