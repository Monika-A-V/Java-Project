package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
//Write a Java program to enter P, T, R and calculate Compound Interest.

public class CompoundInterest 
{

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal (amount), time, and rate::\n");

		        float p = in.nextFloat();
		        float t = in.nextFloat();
		        float r = in.nextFloat();
		        float CI;
		
		        CI = (float)(p * (Math.pow((1 + r / 100), t)));

		        
		        System.out.println("\nCompound Interest = " + CI);
		    }
		}