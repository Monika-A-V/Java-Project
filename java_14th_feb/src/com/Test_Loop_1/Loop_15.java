package com.Test_Loop_1;
import java.util.*;

//write a java program 1!+2!+3!+4!...n to find sum
public class Loop_15 {

	public static void main(String[] args)
	{
		
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int n = input.nextInt();

		        int sum = 0;
		        for (int i = 1; i <= n; i++) 
		        {
		            int factorial = 1;
		            for (int j = 1; j <= i; j++)
		            {
		                factorial =factorial*j;
		            }
		            sum = sum+factorial;
		        }

		        System.out.println("The sum of factorials from 1 to " + n + " is " + sum);
		    }
		

}
