package com.StringDemo;

public class NonRepeatingChar {

	public static void main(String[] args) {

		String s="ghhwqraattyiokkl";
		System.out.println("string is : " +s);
		for(int i=0;i<s.length();i++)
		{
			boolean flag=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
			
				System.out.println("non repeated char : " +s.charAt(i));
		}
		}
	}

}
