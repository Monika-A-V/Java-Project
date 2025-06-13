package com.Logical_Programs;

import java.util.Scanner;

public class BreakStatementDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}

	}
	}




