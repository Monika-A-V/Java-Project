package com.condition;
import java.util.*;
public class areaoftriangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base of triangle");
		double b=sc.nextDouble();
		System.out.println("enter height of triangle");
		double h=sc.nextDouble();
		
		double area=(b/h)/2;
		System.out.println("area of triangle is " +area);
		

	}

}
