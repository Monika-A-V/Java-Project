package com.Test_4;

import java.util.Arrays;

//Write a program to find Minimum frequency char from an Array

public class Test_3 {

	public static void main(String[] args)
	{

		char ch[]= {'a','b','c','b','c','d','d'};

		for(int i=0; i<ch.length; i++) {
		    for(int j=i+1; j<ch.length; j++) {
		        if(ch[i] == ch[j]) {
		            ch[i]++;
		            ch[j]++;
		        }}}
        int minFreq = 0;
		for(int i=1; i<ch.length; i++) {
		    if(ch[i] < ch[minFreq]) {
		        minFreq = i;
		    }
		}
        System.out.println("Minimum frequency character: " + ch[minFreq]);

	}
}
		
		/*char ch[]= {'a','a','b','c','d','b','d'};
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
		    boolean issame=false;
		for(int j=i-1;j>=0;j--)
		{
			if(ch[i]==ch[j])
			{
				issame=true;
				break;
			}
		}
		if(issame==false)
		{
			for(int k=i+1;k<ch.length;k++)
			{
				if(ch[i]==ch[k])
				{
					count++;
				}
			}
			System.out.println(ch[i]+ " " +count);
		}
		}
	}}*/