package com.StringAssignment;

import java.util.Scanner;

public class Q13_InitialName {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		
		String s[]=name.split(" ");
		String initial="";
		
		for(int i=0;i<s.length-1;i++)
		{
			initial=s[i].charAt(0)+".";
			System.out.print(initial);
		}
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
			break;
		}
		}}
