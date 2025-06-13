package com.Logical_Programs;

import java.util.Scanner;

public class KrishnamurtiNumber
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;

        while (temp != 0) 
        {
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) 
            {
                factorial *= i;
            }
            sum =sum+factorial;
            temp =temp/10;
        }

        if (sum == number)
        {
            System.out.println(number + " is a Krishnamurti number");
        }
        else
        {
            System.out.println(number + " is not a Krishnamurti number");
        }
    }
}

