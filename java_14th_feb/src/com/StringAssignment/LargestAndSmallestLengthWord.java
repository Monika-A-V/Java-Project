package com.StringAssignment;

public class LargestAndSmallestLengthWord {

	public static void main(String[] args) {

		String s="this is to java programming";
		String str[]=s.split(" ");
		String shortest=str[0];
		String longest="";
		
		for(String s1:str)
		{
			if(s1.length()<shortest.length())
			{
				shortest=s1;
			}
			else if(s1.length()>longest.length())
			{
				longest=s1;
			}
		}
		System.out.println("shortest word : "+shortest);
		System.out.println("longest word : "+longest);
	}

}
