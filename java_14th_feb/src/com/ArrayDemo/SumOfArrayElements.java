package com.ArrayDemo;
import java.util.*;

public class SumOfArrayElements 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter size of array");
		//int size=sc.nextInt();
		
		int arr[]=new int[5];
		
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
	}
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array elements is : "+sum);
}
}