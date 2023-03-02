package com.AssignmentOnVariablesAndDatatypes;
import java.util.Scanner;

//Java program to find the area of a rectangle


public class RectangleArea 
{
	
	    public static void main(String[] args) 
	    {
	    	Scanner in = new Scanner(System.in);

	        System.out.println("Enter the length & width of the rectangle");

	        float l = in.nextFloat();
	        float w = in.nextFloat();
	        float a;

	    	a = l * w;

	        System.out.println("Area of rectangle = " + a );
	    }
	}

