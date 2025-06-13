package com.Logical_Programs;

import java.util.Scanner;

public class evendigitfromnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum=0;

        System.out.print("Even digits in " + number + ": ");
        while (number != 0)
        {
            int digit = number % 10;
            if (digit % 2 == 0) 
            {
                System.out.print(digit+" ");
                sum=sum+digit;
            }
            number /= 10;
        }

        System.out.println("sum is :"+sum);
    }}