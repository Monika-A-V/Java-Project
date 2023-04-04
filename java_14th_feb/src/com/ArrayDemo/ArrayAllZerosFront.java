package com.ArrayDemo;

import java.util.Arrays;

public class ArrayAllZerosFront 
{

	public static void main(String[] args)
	{
		int a[]= {0,1,0,2,0,3,0,4};
		int size=a.length;
		int temp=a.length-1;
		System.out.println("original array : " +Arrays.toString(a));
		for(int i=a.length-1;i>0;i--)
		{
			if(a[i]!=0)
			{
				a[temp]=a[i];
				temp--;
			}
		}
		while(temp>=0)
		{
			a[temp]=0;
			temp--;
		}
		for(int i=0;i<size;i++)
		{
			//System.out.println(Arrays.toString(a)+" ");
		}

	     System.out.println("all zeros at front : " +Arrays.toString(a));
	}

}

	
