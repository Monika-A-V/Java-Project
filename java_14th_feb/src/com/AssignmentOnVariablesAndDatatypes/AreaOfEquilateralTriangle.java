package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;
// Java program to calculate the area of an equilateral triangle


public class AreaOfEquilateralTriangle
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of side of equilateral triangle");
		double a = sc.nextDouble();   
        double area = ( 1.73 * a*a) / 4 ;  

        System.out.println("Area of Equilateral Triangle is:"+area);  
}

}
