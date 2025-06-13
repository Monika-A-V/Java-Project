package com.Test_8;

/*) Write a java program to find all pairs of elements in an
integer array whose sum is equal to a given number?							
Input Array : [4, 6, 5, -10, 8, 5, 20]
InputNumber:10
Pairs of elements whose sum is 10 are :
4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10*/

public class Q10 {

	public static void main(String[] args)
	{
		        int[] arr = {4, 6, 5, -10, 8, 5, 20};
		        int inputNumber = 10;

		        for (int i = 0; i < arr.length; i++)
		        {
		            for (int j = i+1; j < arr.length; j++)
		            {
		                if (arr[i] + arr[j] == inputNumber) 
		                {
		                    System.out.println(arr[i] + " + " + arr[j] + " = " + inputNumber);
		                }
		            }
		        }
		    }
		}

