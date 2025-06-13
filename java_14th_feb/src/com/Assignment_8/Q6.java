package com.Assignment_8;
import java.util.*;
public class Q6 {

	public static void main(String[] args)
	{

		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter the number of rows: ");
		    int rows = sc.nextInt();

		    System.out.print("Enter the number of columns: ");
		    int columns = sc.nextInt();

		    int[][] matrix = new int[rows][columns];

		    System.out.println("Enter the elements of the matrix:");

		    for (int i = 0; i < rows; i++)
		    {
		      for (int j = 0; j < columns; j++) 
		      {
		        matrix[i][j] = sc.nextInt();
		      }
		    }

		    int sum = 0;
		    for (int i = 0; i < rows; i++) 
		    {
		      for (int j = 0; j < columns; j++)
		      {
		        if (i == j) 
		        {
		          sum += matrix[i][j];
		        }
		      }
		    }

		    System.out.println("The sum of the main diagonal elements of the matrix is " + sum);

		  }
		}
