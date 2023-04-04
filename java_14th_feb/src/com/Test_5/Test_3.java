package com.Test_5;

import java.util.Arrays;

//WAP to replace all the 0’s with 1’s in your array. 
//Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].

public class Test_3 
{

	public static void main(String[] args)
	{
		int a[]= {26, 0,67,45, 0,78,54,34,10, 0,34};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
				}
		System.out.println(Arrays.toString(a));
	}

}
