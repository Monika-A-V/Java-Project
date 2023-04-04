package com.StringDemo;


public class OccuranceOfWordFromString {


	public static void main(String[] args) {

		String s="hello java hello java";
		
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="\n";
				}
				}
			if(str[i]!="\n")
			{
				System.out.println("occurance of word : "+str[i]+ " "+count);
			}
		}
	}

}
