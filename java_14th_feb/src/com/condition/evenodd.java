package com.condition;
import java.util.*;

public class evenodd 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num =sc.nextInt();
		if(num%5==0)
		{
			System.out.println("number is divisible by 5");
		}
		else
		{
			System.out.println("num is not divisible by 5");
		}

	}

}
