package com.Logical_Programs;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int reversedNumber = 0;

        while (temp != 0)
        {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp =temp/10;
        }

        if (number == reversedNumber)
        {
            System.out.println(number + " is a palindrome number.");
        }
        else
        {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}

