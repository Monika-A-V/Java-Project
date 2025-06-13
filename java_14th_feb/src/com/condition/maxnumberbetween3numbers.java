package com.condition;
import java.util.*;

public class maxnumberbetween3numbers {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
			System.out.println(num1+"is max number");
		else if(num2>=num1 && num2>=num3)
			System.out.println(num2+"is max number");
		else
			System.out.println(num3+"is max number");
	}

}
