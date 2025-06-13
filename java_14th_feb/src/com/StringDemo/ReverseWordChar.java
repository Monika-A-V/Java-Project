package com.StringDemo;

public class ReverseWordChar {

	public static void main(String[] args) {

		String s="life is beautiful";
		String str[]=s.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			String words=str[i];
			String revw="";
			for(int j=words.length()-1;j>=0;j--)
			{
				revw=revw+words.charAt(j);
			}
			rev=rev+revw+" ";
		}
		System.out.println(rev);
			
	}

}
