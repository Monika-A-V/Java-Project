package com.ArrayDemo;
import java.util.Scanner;


public class DeleteArrayElement 
{
	public static void main(String[] args)
	{
		int a[]= {11,32,22,77,88,66,55};
		int delete=55;
		for(int i=0;i<a.length;i++)
		{
			if(delete==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}
       /*static void delete(int arr[])
	    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index you want to delete");
		int index=sc.nextInt();
		int i;
		int size=arr.length;
		
		for( i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
			
		}
		size--;
		
	    for( i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}}

	public static void main(String[] args) 
	{
		
		int arr[]= {3,6,7,8,9};
		
		delete(arr);
		}
	}*/
	
	
