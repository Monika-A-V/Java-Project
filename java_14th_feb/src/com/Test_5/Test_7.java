package com.Test_5;

// Sort the first half in ascending and second half in descending of an array
//If the size of the array is 0 or lesser then display
//the message as "Array size should be greater than 0".

import java.util.Scanner;

public class Test_7
{

	public static void main(String[] args)
	{

                Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the size of an array: ");
		        int n = scanner.nextInt();

		        if (n <= 0) 
		        {
		            System.out.println("Array size should be greater than 0");
		            return;
		        }

		        int[] arr = new int[n];
		        System.out.println("Enter the elements: ");
		        for (int i = 0; i < n; i++)
		        {
		            arr[i] = scanner.nextInt();
		        }

		        for (int i = 0; i < n/2; i++) 
		        {
		            for (int j = i+1; j < n/2; j++)
		            {
		                if (arr[j] < arr[i]) {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }
               for (int i = n/2; i < n-1; i++)
		        {
		            for (int j = i+1; j < n; j++) 
		            {
		                if (arr[j] > arr[i]) 
		                {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }

		        for (int i = 0; i < n; i++) 
		        {
		            System.out.println(arr[i]);
		        }}}