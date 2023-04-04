package com.Test_6;

/*WAP to replace all negative value with its immediate left elements square.
 *  Means arr[] = [12, 3,-19, 29, 5, -61, 44, 7, -9] 
 *  Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].*/

public class Test_6 {

	public static void main(String[] args)
	{

		        int[] arr = {12, 3, -19, 29, 5, -61, 44, 7, -9};
		        
		        for(int i=1; i<arr.length; i++) 
		        {
		            if(arr[i] < 0)
		            {
		                arr[i] = arr[i-1] * arr[i-1];
		            }
		        }
		        for(int i=0; i<arr.length; i++)
		        
		        {
		            System.out.print(arr[i] + " ");
		        }
		    }
		}