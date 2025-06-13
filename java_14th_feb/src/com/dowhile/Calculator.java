package com.dowhile;

import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("Please select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num4 = scanner.nextInt();
                    int difference = num3 - num4;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int num5 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num6 = scanner.nextInt();
                    int product = num5 * num6;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    int numerator = scanner.nextInt();
                    System.out.print("Enter denominator: ");
                    int denominator = scanner.nextInt();
                    if (denominator == 0) {
                        System.out.println("Error: division by zero");
                    } else {
                        double quotient = (double) numerator / denominator;
                        System.out.println("Result: " + quotient);
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Do you want to continue");
            choice=scanner.nextInt();
            
        } while (choice==1);
    }
}

