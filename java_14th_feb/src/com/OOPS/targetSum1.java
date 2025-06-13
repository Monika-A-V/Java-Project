package com.OOPS;

public class targetSum1
{
	  public static void findPairs(int[] arr, int target)
	  {
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = i + 1; j < arr.length; j++)
	            {
	                if (arr[i] + arr[j] == target)
	                {
	                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
	                }
	            }
	        }
	    }

	public static void main(String[] args) 
	{

		int[] array = {2, 4, 7, 5, 9, 10, 1};
        int target = 11;

        findPairs(array, target);
	}

}
