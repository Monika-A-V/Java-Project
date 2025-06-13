
package com.Test_4;

import java.util.Arrays;

/*Write a  program to remove duplicate elements from an array?
Array With Duplicates : [4, 3, 2, 4, 9, 2]
Array Without Duplicates : [4, 3, 2, 9]
*/
public class Test_7 {

	public static void main(String[] args)
	{

		int a[]= {1,2,1,3,4,2,3,4,6,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}}
