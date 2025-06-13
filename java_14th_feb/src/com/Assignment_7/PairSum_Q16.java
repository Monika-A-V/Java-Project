
package com.Assignment_7;
//16.Write a java program to find all pairs of elements in an integer array whose
//sum is equal to a given number?
//Input Array - [4, 6, 5, -10, 8, 5, 20]
//Input Number - 10
//Pairs of elements whose sum is 10 are -
//4 + 6 = 10
//5 + 5 = 10
//-10 + 20 = 10

public class PairSum_Q16
{
	   public static void findPairs(int[] arr, int sum)
	    {
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if (arr[i] + arr[j] == sum)
	                {
	                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
	                }
	            }
	        }
	    }
	
  public static void main(String[] args) 
	{
		int[] arr = {4, 6, 5, -10, 8, 5, 20};
        int sum = 10;

        PairSum_Q16.findPairs(arr, sum);
    }

	}


