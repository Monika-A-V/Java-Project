package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
/**
 * Java program to perform all arithmetic operations.
 */

public class ArithmeticOperations

{
	public static void main(String[] args) {
	        
	      
	        Scanner in = new Scanner(System.in);

	        
	        System.out.println("Enter first number :");
	        int num1 = in.nextInt();
	        System.out.println("Enter second number :");
	        int num2 = in.nextInt();
	        
	        int sum 		= num1 + num2;
	        int difference 	= num1 - num2;
	        int product 	= num1 * num2;
	        int quotient	= num1 / num2;
	        int modulo	    = num1 % num2;
	        
	        
	        System.out.println("Sum : "         + sum);
	        System.out.println("Difference : "  + difference);
	        System.out.println("Product : "     + product);
	        System.out.println("Quotient : "    + quotient);
	        System.out.println("Modulo : "      + modulo);
	    }
	}

