
package com.Logical_Programs;

import java.util.Scanner;

public class SumOfFirstAndLastDigit 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int lastDigit = number % 10;
        int firstDigit = number;
        
        while(firstDigit >= 10) 
        {
            firstDigit = firstDigit / 10;
        }
        
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digits: " + sum);
    }
}