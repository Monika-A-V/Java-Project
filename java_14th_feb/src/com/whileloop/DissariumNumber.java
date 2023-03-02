package com.whileloop;
import java.util.Scanner;

public class DissariumNumber
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int sum = 0;
        int position = 0;

        while (temp > 0) 
        {
            position++;
            temp = temp/10;
        }

        temp = number;
        while (temp > 0) 
        {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= position; i++) 
            {
                power *= digit;
            }
            sum = sum+power;
            temp =temp/10;
            position--;
        }

        if (sum == number) 
        {
            System.out.println(number + " is a dissarium number.");
        }
        else
        {
            System.out.println(number + " is not a dissarium number.");
        }
    }
}
