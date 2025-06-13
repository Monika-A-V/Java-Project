package com.StringDemo;

public class CountUpperLowerChar {

	public static void main(String[] args) {

		String s="monIKA";
		int upper=0;
		int lower=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				upper++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lower++;
			}
			else
			{
				continue;
			}
				
		}
		System.out.println("upper count is = "+upper+" and lower count is = "+lower);
	}

}
