package com.Test_3;
import java.util.*;

//You have to build a loan calculator. If a single rate of interest is provided then
//it is a housing loan and loan is principal amount * (100 + rate) If two values are
// provided then it is a commercial loan and loan is principal amount * (value 1 + value 2 +100).

public class Test_11 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        double principal, rate, value1, value2, loan;

	        System.out.print("Enter the principal amount: ");
	        principal = input.nextDouble();

	        System.out.print("Enter the rate of interest: ");
	        rate = input.nextDouble();

	        if (rate >= 0)
	        {
	            loan = principal * (100 + rate) / 100;
	        } 
	        else 
	        {
	            System.out.print("Enter value 1: ");
	            value1 = input.nextDouble();

	            System.out.print("Enter value 2: ");
	            value2 = input.nextDouble();

	            loan = principal * (value1 + value2 + 100) / 100;
	        }

	        System.out.println("The loan amount is: " + loan);
	    }
	}

