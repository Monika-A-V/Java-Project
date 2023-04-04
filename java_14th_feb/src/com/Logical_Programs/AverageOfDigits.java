package com.Logical_Programs;

import java.util.Scanner;

public class AverageOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            count++;
            num /= 10;
        }

        double average = (double) sum / count;
        System.out.println("The average of the digits in the number is " + average);
    }
}

