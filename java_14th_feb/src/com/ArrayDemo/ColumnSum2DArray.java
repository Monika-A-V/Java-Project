package com.ArrayDemo;

import java.util.Arrays;

public class ColumnSum2DArray {

	public static void main(String[] args)
	{

		int[][] arr = {{4, 8, 6}, {9, 3, 1}, {5, 8, 3}};


	    for (int i = 0; i <arr.length; i++)
	    {
	        int sum = 0;
	        for (int j = 0; j <arr[i].length; j++) 
	        {
	            sum += arr[j][i];
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.print("sum of column 0 is = "+sum);
	        System.out.println();
	    }
	}
	}


