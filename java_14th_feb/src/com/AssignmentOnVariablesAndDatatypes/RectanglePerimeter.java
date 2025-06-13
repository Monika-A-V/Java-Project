package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
// Java program to find the perimeter of a rectangle


public class RectanglePerimeter 
{
	
	    public static void main(String[] args)
	    {
	    	Scanner in = new Scanner(System.in);

	        System.out.println("Enter the length & width of the rectangle");

	        
	        float l = in.nextFloat();
	        float w = in.nextFloat();
	        float p;

	        
	    	p = 2 * (l + w);
	        System.out.println("The Perimeter of rectangle = " + p);
	    }
	}
