package com.Logical_Programs;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("given number is perfect");
		}
		else
		{
			System.out.println("given number is not perfect");
		}
	}

}
