package com.Test_5;

//WAP to arrange the elements of an given array of integers 
//where all Even integers appear before all the Odd integers

public class Test_5
{
	public static void arrangeEvenOdd(int[] arr) 
	{
	    int left = 0, right = arr.length - 1;
	    
	    while (left < right)
	    {
	        if(arr[left] % 2 == 0 && left < right)
	        {
	            left++;
	        }
	        if(arr[right] % 2 == 1 && left < right) 
	        {
	            right--;
	        }
	        if(left < right)
	        {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        }
	    }}

	public static void main(String[] args) 
	{

		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		    arrangeEvenOdd(arr);
		    for (int i = 0; i < arr.length; i++) 
		    {
		        System.out.print(arr[i] + " ");
		    }
		}}
