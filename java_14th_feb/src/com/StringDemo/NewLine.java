package com.StringDemo;

import java.util.Scanner;

public class NewLine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		String s=sc.nextLine();
		
		System.out.println(s);
		
		System.out.println("Enetr age");
		int age=sc.nextInt();
		System.out.println("age is..."+age);
}
}