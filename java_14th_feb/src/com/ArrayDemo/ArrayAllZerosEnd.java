package com.ArrayDemo;
import java.util.*;

public class ArrayAllZerosEnd 
{

	public static void main(String[] args) 
	{
		int a[]= {0,1,0,2,0,3,0,4};
		int size=a.length;
		System.out.println("original array : " +Arrays.toString(a));
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]!=0)
			{
				a[count]=a[i];
				count++;
			}
		}
		while(count<size)
		{
			a[count]=0;
			count++;
		}
		for(int i=0;i<size;i++)
		{
			//System.out.println(Arrays.toString(a)+" ");
		}

	     System.out.println("all zeros at end : " +Arrays.toString(a));
	}

}
