package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;

// Java program to find all angles of a triangle if two angles are given

public class GivenTwoAnglesFindThirdAngleOfTriangle 
{

	public static void main(String[] args) 
	{
		    	Scanner in = new Scanner(System.in);

		        System.out.println("Enter the two angles of triangle::\n");

		        int p = in.nextInt();
		        int q = in.nextInt();
		        int r;
		        
		        r = 180 - (p + q);
		        System.out.println("\nThird angle of the triangle = " + r + "\n");
		    }
		}

	


