package com.ArrayDemo;

import java.util.Arrays;

public class EvenPositionElement 
{

	public static void main(String[] args) 
	{
		int a[]= {2,3,5,6,7,8,9};
		System.out.println("array elements are : "+Arrays.toString(a));
		
		System.out.println("even position elements are ");
		for(int i=0;i<a.length;i=i+2)
		{
			
			System.out.println(a[i]);
		
			
		}

	}

}
