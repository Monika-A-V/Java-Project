package com.Test_7;

//Find largest word in a String “I like programming”. You can
//use split function of string


public class Q1 {

	public static void main(String[] args) 
	{
		String s="india is beautiful country";
		String str[]=s.split(" ");
		String largest="";
		
		for(String s1:str)
		{
			if(s1.length()>largest.length())
			{
				largest=s1;
			}
		}
		System.out.println(largest);

	}}
