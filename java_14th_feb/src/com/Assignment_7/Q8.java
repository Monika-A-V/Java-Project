package com.Assignment_7;

//WAP to find the maximum and minimum value in an array.

public class Q8 {

	public static void main(String[] args) {

		int a[]=new int[] {1,3,4,5,6,7,8,9};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("min value is : " +min+"\nmax value is : " +max);
		
		
	}

}
