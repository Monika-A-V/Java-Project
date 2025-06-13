package com.Assignment_7;
import java.util.Arrays;
import java.util.Scanner;

//Take 10 integer inputs from user and store them in an array. Again ask user 
//to give a number. Now, tell user whether that number is present in array or 
//not.
public class Q3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("10 numbers from user");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		 System.out.print("Enter a number to search: ");
	     int searchNumber = sc.nextInt();
	        
	     boolean found = false;
	     for (int i = 0; i < 10; i++) 
	        {
	            if (a[i] == searchNumber)
	            {
	                found = true;
	                break;
	            }
	        }
	    if (found)
	    {
	      System.out.println("The number " + searchNumber + " is present in the array.");
	        } 
	    else 
	    {
	      System.out.println("The number " + searchNumber + " is not present in the array.");
	     }
	        }
	}
