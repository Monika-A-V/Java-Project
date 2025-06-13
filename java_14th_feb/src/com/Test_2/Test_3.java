package com.Test_2;
import java.util.*;

public class Test_3 
{
	    public static void main(String[] args)
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number to check if it is a Kaprekar number: ");
	        int num = input.nextInt();
	        int square = num * num;
	        int count = 0;
	        int temp = square;

	        while (temp > 0)
	        {
	            count++;
	            temp = temp/10;
	        }

	        int divisor = 1;
	        for (int i = 1; i <= count / 2; i++)
	        {
	            divisor =divisor*10;
	        }

	        int sum = (square / divisor) + (square % divisor);

	        if (sum == num) 
	        {
	            System.out.println(num + " is a Kaprekar number.");
	        } 
	        else 
	        {
	            System.out.println(num + " is not a Kaprekar number.");
	        }
	    }
	}



