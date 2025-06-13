package com.ArrayDemo;
import java.util.*;

public class OddAndEvenElementsFromArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		
		//}
		//for(int i=0;i<a.length;i++)
		//{
			if(a[i]%2==0)
			{
				System.out.println("even number : "+a[i]);
			}
			else if(a[i]%2!=0)
			{
				System.out.println("odd number : " +a[i]);
			}
		}

	}

}
