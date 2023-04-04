package com.StringDemo;

import java.util.Scanner;

public class StringReverse 
{
	public static void reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static String strReverse(String s)
	{
		String str="";
		for(int i=0;i<s.length();i++)
		{
			str=s.charAt(i)+str;
		}
		return str;
	}

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str1=sc.nextLine();
		
		//StringReverse.reverse(str1);
		System.out.println(StringReverse.strReverse(str1));
		
		
	}

}
