package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
// Java program to find the area of a triangle if base and height are given


public class GivenBaseAndHeightFindAreaOfTriangle
{

	public static void main(String[] args)
	{
		
		    	Scanner in = new Scanner(System.in);

		        System.out.println("Enter the base & height of the triangle::\n");

		        float b = in.nextFloat();
		        float h = in.nextFloat();
		        float a;


		        a = (float)((b * h) / 2);

		        
		        System.out.println("\nArea of the triangle = " + a + " sq. units\n");
		    }
		}

	


