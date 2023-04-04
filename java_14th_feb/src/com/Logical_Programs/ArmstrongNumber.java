
package com.Logical_Programs;

import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int c=0;
        int a;
        int temp;
        int num=153;
        temp=num;
        while(num>0)
        {
        	a=num%10;
        	num=num/10;
        	c=c+(a*a*a);
        	
        }
        if (temp==c) 
        {
            System.out.println("Armstrong number");
        } else 
        {
            System.out.println("Not Armstrong number");
        }
    }
}

