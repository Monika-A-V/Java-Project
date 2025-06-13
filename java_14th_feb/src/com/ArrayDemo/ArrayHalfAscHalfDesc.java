package com.ArrayDemo;

public class ArrayHalfAscHalfDesc
{

	public static void main(String[] args)
	{		    
		        
		int[] arr = {10, 45, 21, 8, 4, 32, 67, 81};
        int n = arr.length;
        
        for (int i = 0; i < n/2; i++) 
        {
            for (int j = i+1; j < n/2; j++) 
            {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = n/2; i < n; i++)
        {
            for (int j = i+1; j < n; j++) 
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}