package com.StringDemo;

public class VowelUpperCase {

	public static void main(String[] args)
	{

		String s="i bought a toy car";
		char s1[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char c=Character.toLowerCase(s1[i]);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				s1[i]=Character.toUpperCase(s1[i]);
			}
		}
		System.out.println(s1);
	}

}
