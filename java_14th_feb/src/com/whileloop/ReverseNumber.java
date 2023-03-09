package com.whileloop;

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int reverse = 0;
        while (num>0) 
        
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of the number is: " + reverse);
    }
}

