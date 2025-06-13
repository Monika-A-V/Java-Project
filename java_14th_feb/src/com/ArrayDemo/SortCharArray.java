package com.ArrayDemo;
import java.util.*;

public class SortCharArray 
{
	
	public static void SortChar(char[] ch)
	{
		char[] a = {'Z', 'a', 'B', 'c', 'F', 'd'};
		System.out.println("unsorted array : " +Arrays.toString(a));

		for (int i = 0; i < a.length-1; i++)
		{
		    for (int j = i+1; j < a.length-1; j++)
		    {
		        if (a[i] > a[j])
		        {
		            char temp = a[i];
		            a[i] = a[j];
		            a[j] = temp;
		        }
		    }
		}

		System.out.println("sorted array : " +Arrays.toString(a));
		
	}
	
	public static void main(String[] args)
	{
		char[] ch= {'A','b','C','s','I','O'};
		
		SortCharArray.SortChar(ch);
	}
}
	/*public static void main(String[] args)
	{
		char[] a = {'Z', 'a', 'B', 'c', 'F', 'd'};
		System.out.println("unsorted array : " +Arrays.toString(a));

		for (int i = 0; i < a.length-1; i++)
		{
		    for (int j = i+1; j < a.length-1; j++)
		    {
		        if (a[i] > a[j])
		        {
		            char temp = a[i];
		            a[i] = a[j];
		            a[j] = temp;
		        }
		    }
		}

		System.out.println("sorted array : " +Arrays.toString(a));*/


	
