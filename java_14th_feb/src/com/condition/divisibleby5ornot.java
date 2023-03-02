package com.condition;

import java.util.Scanner;

public class divisibleby5ornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		
		if(num%5==0)
		{
			System.out.println("number is divisible by 5");
		}
		else
		{
			System.out.println("number is not divisible by 5");
		}
		

	}

}
