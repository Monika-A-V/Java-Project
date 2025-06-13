package com.Test_4;

import java.util.Arrays;

/*Write a  program to separate zeros from non-zeros in an integer array?
Input Array : [12, 0, 7, 0, 8, 0, 3]
Input Array After moving zeros to end :
[12, 7, 8, 3, 0, 0, 0]
*/

public class Test_6 {

	public static void main(String[] args) {

		int a[]= {12,0,7,0,8,0,3};
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

