package com.ClassAndObject;
import java.util.*;

public class PassByValue 
{

	public static void swap(int n1,int n2)
		{
			System.out.println("before swapping "+n1+" "+n2);
			int temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("after swapping "+n1+" "+n2);
		}
		
		public static void main(String[] args)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first number");
			int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			
			System.out.println("before swap "+num1+" "+num2);
			PassByValue.swap(num1,num2);
			
			System.out.println("after swap "+num1+" "+num2);
			
			

	}

}
