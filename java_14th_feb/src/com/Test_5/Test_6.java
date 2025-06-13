package com.Test_5;

//WAP to display all perfect square number in array. Means e.g.
//arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.

public class Test_6
{

	public static void main(String[] args) 
	{

		        int[] arr = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0};

		        for (int i = 0; i < arr.length; i++)
		        {
		            int num = arr[i];
		            int j = 1;
		            while (num > 0)
		            {
		                num -= j;
		                j = j+2;
		            }
		            if (num == 0) 
		            {
		                System.out.println(arr[i]);
		            }
		        }
		    }
}
