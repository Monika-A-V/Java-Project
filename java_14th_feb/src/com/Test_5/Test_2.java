package com.Test_5;

//Write a Java program to test the equality of two arrays. 
//Means e.g arr1[] = [12, 22, 32, 42, 52, 62] and
//arr2[] = [52, 22, 62, 12, 42, 32] Here both arrays are equal.

public class Test_2
{

	public static void main(String[] args)
	{
		
		        int[] arr1 = {12, 22, 32, 42, 52, 62};
		        int[] arr2 = {52, 22, 62, 12, 42, 32};

		        boolean equal = true;

		        if (arr1.length != arr2.length)
		        {
		            equal = false;
		        } 
		        else
		        {
		            for (int i = 0; i < arr1.length; i++) 
		            {
		                boolean found = false;
		                for (int j = 0; j < arr2.length; j++) 
		                {
		                    if (arr1[i] == arr2[j])
		                    {
		                        found = true;
		                        break;
		                    }
		                }
		                if (!found) 

		                {
		                    equal = false;
		                    break;
		                }
		            }
		        }

		        if (equal)
		        {
		            System.out.println("Both arrays are equal");
		        } 
		        else 
		        {
		            System.out.println("Both arrays are not equal");
		        }}}