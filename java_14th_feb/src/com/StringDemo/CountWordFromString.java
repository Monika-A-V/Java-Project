package com.StringDemo;

public class CountWordFromString {

	public static void main(String[] args) {

		String s="hello java language";
		String words[]=s.split(" ");
		int count=0;
		
		for(int i=0;i<words.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
