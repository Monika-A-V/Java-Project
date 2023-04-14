package com.CollectionDemo;

import java.util.ArrayList;

public class PrimeNumberFromArrayList
{
	public static void isPrime(int number) 
	{
	    boolean isPrime = true;
	    if (number <= 1) 
	    {
	        isPrime = false;
	    }
	    for (int i = 2; i * i <= number; i++) 
	    {
	        if (number % i == 0) 
	        {
	            isPrime = false;
	            break;
	        }
	    }
	    if (isPrime==true) 
	    {
	        System.out.println(number + " is prime.");
	    }
	}
	public static void main(String[] args) 
	{
                ArrayList<Integer> al = new ArrayList<Integer>();
		        al.add(2);
		        al.add(3);
		        al.add(4);
		        al.add(5);
		        al.add(6);
		        al.add(7);
		        al.add(8);
		        al.add(9);
		        al.add(10);
		        
		        for (int number : al)
		        {
		           isPrime(number);
		        
		        }
	}
}
		    