package com.whileloop;

import java.util.Scanner;

public class evendigitfromnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Even digits in " + number + ": ");
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }

    }
}
