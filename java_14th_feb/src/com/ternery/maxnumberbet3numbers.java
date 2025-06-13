package com.ternery;

import java.util.Scanner;

public class maxnumberbet3numbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		
		int greatest=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
		System.out.println("the greatest number is " +greatest);
		

	}

}
