package com.condition;
import java.util.*;

public class areaofcircle {

	public static void main(String[] args)
	
	{
		double pi=3.14,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		int r=sc.nextInt();
		area=pi*r*r;
		System.out.println("area of circle " +area);

	}

}
