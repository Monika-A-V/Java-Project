package com.Logical_Programs;

import java.util.Scanner;

public class CheckBinary
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int copyNum = num;
        boolean isBinary = true;

        while (copyNum != 0)
        {
            int digit = copyNum % 10;
            if (digit != 0 && digit != 1) 
            {
                isBinary = false;
                break;
            }
            copyNum /= 10;
        }

        if (isBinary==true) {
            System.out.println(num + " is a binary number");
        } 
        else 
        {
            System.out.println(num + " is not a binary number");
        }
    }
}

