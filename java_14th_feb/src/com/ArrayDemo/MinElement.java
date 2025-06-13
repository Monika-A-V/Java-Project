package com.ArrayDemo;

import java.util.Arrays;

public class MinElement {

	public static void main(String[] args)
	{
		int a[]= {1,9,3,5,6,7,2};
		System.out.println("Array elemenyt are : "+Arrays.toString(a));
		
		System.out.println("min array element is: ");
        int min=a[0];
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
				System.out.println(min);
				
			}
		}
	

