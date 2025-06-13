package com.StringDemo;

public class String1 {

	public static void main(String[] args) {

		String s="monika123";
		//char ch[]=s.toCharArray();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				int digit=Character.getNumericValue(c);
                count++;
			}
		}
			System.out.println(count);
	}

}
