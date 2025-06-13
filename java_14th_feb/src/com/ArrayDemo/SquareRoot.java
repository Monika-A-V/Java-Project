package com.ArrayDemo;

public class SquareRoot {

	static int floorSqrt(int x)
    {
       
        
        int i, result = 1;
 
       for( i=0;result<x;i++)
       {
           
            result = i * i;
        }
        return i - 1;
    }

	public static void main(String[] args)
	{
		int arr[]= {7,6,25,47,9};
		for(int i=0;i<arr.length;i++)
		{
		int x=floorSqrt(arr[i]);
		if(x*x==arr[i]) {
			System.out.println(arr[i]);
		}

	}

}
	}