package com.Test_3;
import java.util.*;

//Write a program to print all automorphic numbers between 1 to n 

public class Test_12 
{

	public static void main(String[] args) 
	{
                Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the value of n: ");
		        int n = sc.nextInt();

		        System.out.println("Automorphic numbers between 1 and " + n + " are:");

		        for (int i = 1; i <= n; i++) 
		        {
		            int square = i * i;
		            int num = i;
		            boolean isAutomorphic = true;
		            
		            while (num > 0)
		            {
		                if (num % 10 != square % 10)
		                {
		                    isAutomorphic = false;
		                    break;
		                }
		                num /= 10;
		                square /= 10;
		            }
		            if (isAutomorphic)
		            {
		                System.out.print(i + " ");
		            }
		        }}}