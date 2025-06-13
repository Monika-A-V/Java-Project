package com.Test_2;
import java.util.*;
//WAP to calculate x y  where x is base and y is index without using readymade function.


public class Test_2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int base=sc.nextInt();
		System.out.println("enter expo");
		int expo=sc.nextInt();
		
		int i=1;
		int power=1;
		while(i<=expo)
		{
			power=power*base;
			i++;
		}
		System.out.println("powere is : " +power);
	}
}
