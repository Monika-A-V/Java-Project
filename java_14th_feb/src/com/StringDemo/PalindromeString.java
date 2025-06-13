package com.StringDemo;

public class PalindromeString {

	public static void main(String[] args) {

		String s="radar";
		String revstr="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			revstr=revstr+s.charAt(i);
		}
		if(s.toLowerCase().equals(revstr.toLowerCase()))
		{
			System.out.println(s+ " is palindrome");
		}
		else
		{
			System.out.println(s+ " not palindrome");
		}
		
	}

}
