package com.Test_10;

//Print average of each row and column for 3x4 matrix 2D array. Data is already present 

public class Q17 {

	public static void main(String[] args) 
	{
			        int[][] matrix = {
		            {2, 4, 6, 8},
		            {1, 3, 5, 7},
		            {0, 2, 4, 6}
		        };
		        
		        for (int i = 0; i < matrix.length; i++) 
		        {
		            double rowSum = 0;
		            for (int j = 0; j < matrix[i].length; j++) 
		            {
		                rowSum += matrix[i][j];
		            }
		            double rowAvg = rowSum / matrix[i].length;
		            System.out.println("Row " + (i+1) + " average: " + rowAvg);
		        }
		        
		        for (int j = 0; j < matrix[0].length; j++)
		        {
		            double colSum = 0;
		            for (int i = 0; i < matrix.length; i++)
		            {
		                colSum += matrix[i][j];
		            }
		            double colAvg = colSum / matrix.length;
		            System.out.println("Column " + (j+1) + " average: " + colAvg);
		        }
		    }
		}