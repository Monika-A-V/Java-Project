package com.StringAssignment;

//Write a Java program to convert uppercase string to lowercase (without 
//using string function)

public class Q6 {

	public static void main(String[] args) {

		String s="MONIKA AVHAD";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			ch[i]=(char)(ch[i]+32);
		
		System.out.println(ch[i]);
	}

}}
}