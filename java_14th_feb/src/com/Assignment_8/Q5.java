package com.Assignment_8;

//. Pass a 2D array to function and access all its elements.

public class Q5
{
	public static void printArray(int[][] arr)
	{
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args)
	{

		 int[][] arr = { {1, 2}, {3, 4}, {5, 6} };
	        printArray(arr);
	}

}
