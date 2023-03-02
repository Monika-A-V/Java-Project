package com.condition;
import java.util.*;

public class divisibleby3or5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		if(n%3==0)
		{
			System.out.println("number is divisible by 3");
		}
		else if(n%5==0)
		{
			System.out.println("number is not divisible by 5");
		}
		else
		{
			System.out.println("not divisible");
		}
		

	}

}
