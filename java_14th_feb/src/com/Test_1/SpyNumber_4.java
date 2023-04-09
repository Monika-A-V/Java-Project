package com.Test_1;
import java.util.*;
public class SpyNumber_4 
{

	public static void main(String[] args) 
	{
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = input.nextInt();

		        int sum = 0, product = 1, digit;
		        
		        while (num != 0)
		        {
		            digit = num % 10;
		            sum = sum+digit;
		            product = product*digit;
		            num = num/10;
		        }
		        if (sum == product) 
		        {
		            System.out.println("The number is a Spy number.");
		        } else 
		        {
		            System.out.println("The number is not a Spy number.");
		        }
		    }
		


	}


