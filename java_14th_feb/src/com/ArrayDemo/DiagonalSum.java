package com.ArrayDemo;
import java.util.Scanner;


public class DiagonalSum {

	public static void main(String[] args) {


		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the number of rows of the array: ");
		        int rows = input.nextInt();
		        System.out.print("Enter the number of columns of the array: ");
		        int cols = input.nextInt();

		        int[][] arr = new int[rows][cols];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < rows; i++) 
		        {
		            for (int j = 0; j < cols; j++) 
		            {
		                arr[i][j] = input.nextInt();
		            }
		        }
		        int sum = 0;
		        for (int i = 0; i < rows && i < cols; i++)
		        {
		            sum += arr[i][i];
		        }

		        System.out.println("The diagonal sum of the array is " + sum);
		    }
		}