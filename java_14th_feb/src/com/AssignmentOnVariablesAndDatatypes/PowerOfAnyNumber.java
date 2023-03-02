package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
// Java program to find the power of any number

public class PowerOfAnyNumber 
{
	    public static void main(String[] args)
	    {
	    	Scanner in = new Scanner(System.in);

	        System.out.println("Enter the base & exponent values::\n");

	        int b = in.nextInt();
	        int e = in.nextInt();
	        int r = 1;
	        int i = 1;

	        while(i <= e) 
	        {
	            r *= b;
	            i++;
	        }

	        System.out.println("\nResult: " + b + "^" + e + " = " + r + "\n");
	    }
	}


