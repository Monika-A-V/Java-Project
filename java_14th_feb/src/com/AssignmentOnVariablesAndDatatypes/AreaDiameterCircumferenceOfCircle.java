package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;

public class AreaDiameterCircumferenceOfCircle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		double radius, diameter, area, circumference;	

		System.out.print("Please Enter the Circle radius = ");
		radius = sc.nextDouble();	
	
		diameter = 2 * radius;
		area = 3.14 * radius * radius; 
		circumference = 2 * 3.14 * radius;

		System.out.println("\nArea of a Circle        = " + area);
		System.out.println("Diameter of a Circle      = " + diameter);
		System.out.println("Circumference of a Circle = " + circumference);

	}

}
