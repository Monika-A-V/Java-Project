package com.whileloop;
import java.util.Scanner;

public class AutomorphicNumber
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int square = num * num;
        int temp = num;
        int count = 0;
        while (temp != 0)
        {
            count++;
            temp /= 10;
        }
        
        int divisor = 1;
        for (int i = 1; i <= count; i++) 
        {
            divisor *= 10;
        }
        
        int lastDigits = square % divisor;
        if (lastDigits == num)
        {
            System.out.println(num + " is an automorphic number.");
        } else 
        {
            System.out.println(num + " is not an automorphic number.");
        }
    }
}
