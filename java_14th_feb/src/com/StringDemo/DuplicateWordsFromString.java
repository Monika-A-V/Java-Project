package com.StringDemo;

import java.util.Scanner;

public class DuplicateWordsFromString {

	public static void main(String[] args)
	{

		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		String s1[]=s.split(" ");
		
		for(int i=0;i<s1.length-1;i++)
		{
			if(s1[i].equals(" "))
			{
				continue;
			}
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
			{
				System.out.println(s1[i]);
						}
			}
		}
	}

}
