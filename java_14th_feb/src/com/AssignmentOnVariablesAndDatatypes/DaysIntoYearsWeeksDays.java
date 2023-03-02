package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
// Java program to convert days into years, weeks, and days

public class DaysIntoYearsWeeksDays 
{

	    public static void main(String[] args)
	    {
	    	Scanner in = new Scanner(System.in);

	        System.out.println("Enter the days");

	        int d = in.nextInt();
	        int y;
	        int w;

	        y = (d / 365);
	        w = (d % 365) / 7;
	        d = d - ((y * 365) + (w));

	        
	        System.out.println(y + " Year, " + w + " Weeks, and " + d + " Days");
	    }
	}

