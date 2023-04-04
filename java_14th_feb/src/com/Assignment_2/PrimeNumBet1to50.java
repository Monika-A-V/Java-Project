package com.Assignment_2;

//Find all prime number between 1 to 50.

public class PrimeNumBet1to50 {

	public static void main(String[] args)
	{
			      boolean isPrime;

			      System.out.println("Prime numbers from 1 to 50 are:");
			      for (int i = 2; i <= 50; i++) 
			      {
			         isPrime = true;
			         for (int j = 2; j <= i/2; j++)
			         {
			            if (i % j == 0) 
			            {
			               isPrime = false;
			               break;
			            }
			         }
			         if (isPrime)
			         {
			            System.out.print(i + " ");
			         }
			      }
			   }
			}

	
