package com.ArrayDemo;

import java.util.Scanner;

public class UpperTriangle
{

	public static void main(String[] args)
	{
	        int[][] matrix = new int[4][4];
	        for (int i = 0; i < 4; i++) 
	        {
	            for (int j = 0; j < 4; j++) 
	            {
	                matrix[i][j] = i * 4 + j + 1;
	            }
	        }

	        for (int i = 0; i < 4; i++) 
	        {
	            for (int j = i; j < 4; j++) 
	            {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}