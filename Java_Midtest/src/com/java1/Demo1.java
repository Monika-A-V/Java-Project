package com.java1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		String s[]= {"monika","pritee","jayashree","pooja"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					}
				else if(s[i].length()==s[j].length())
				{
					if(s[i].compareTo(s[j])>0)
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(s));
		}

}
