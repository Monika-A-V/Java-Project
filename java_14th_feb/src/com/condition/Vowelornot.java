package com.condition;

import java.util.Scanner;

public class Vowelornot {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
		System.out.println("char is vowel");
		}
		else 
		{
		   System.out.println("char is consonent");
		}

	}
}
