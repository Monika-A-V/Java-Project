package com.ArrayDemo;
import java.util.*;

public class MaxElement 
{

	public static void main(String[] args) 
	{
		int a[]= {1,9,5,2,7,8,3};
		System.out.println("array elements are : " +Arrays.toString(a));
		
		//System.out.println("Max And Min elements are : ");
		int count=0;
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				count++;
			
			System.out.println("max element is : " +max+" count is :" +count);
			}
		}
		/*int min=a[0];
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
				System.out.println(min);
			}
		}*/
			
		}

	}


