package com.StringDemo;

public class LengthOfString {

	public static void main(String[] args) {

		String s="hello java";
		char ch[]=s.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
			}
			System.out.println(count);
		}
		}
