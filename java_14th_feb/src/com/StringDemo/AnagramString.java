package com.StringDemo;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String a="abcd";
		String b="bdca";
		char c[]=a.toCharArray();
		char c1[]=b.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		if(Arrays.equals(c,c1)==true)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
	}

}
