package com.JavaDemo;

public class Demo4 
{

	public static void main(String[] args) 
	{
		String str="mn098hjkn";
		//String s[]=str.split(" ");
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				int digit=Character.getNumericValue(ch);
				sum=sum+digit;
			}
		}
		System.out.println(sum);

		
		
		
		
	}

}
