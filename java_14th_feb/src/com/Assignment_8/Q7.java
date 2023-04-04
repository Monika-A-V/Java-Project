package com.Assignment_8;

//WAP to find sum of each column of a matrix.

public class Q7
{

	public static void main(String[] args) 
	{
		  int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		        
		        int rows = matrix.length;
		        int cols = matrix[0].length;
		        int[] columnSum = new int[cols];
		        for (int j = 0; j < cols; j++)
		        {
		           for (int i = 0; i < rows; i++)
		           {
		                columnSum[j] += matrix[i][j];
		            }
		        }
		        for (int j = 0; j < cols; j++)
		        {
		           System.out.println("Sum of column " + (j+1) + " is " + columnSum[j]);
		        }
		    }
		}
