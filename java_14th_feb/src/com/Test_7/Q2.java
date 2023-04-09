package com.Test_7;

/*String s="India is my country" create patteren using String and  insert @ inseted of i/I
@nd@a 
@nd@a @s 
@nd@a @s my 
@nd@a @s my country*/

public class Q2 {

	public static void main(String[] args) {

		String s="india is my country";
		String s1=s.toLowerCase();
		//System.out.println(s1.replace("i","@"));
		String count=" ";
		String str[]=s1.replace("i","@").split(" ");
		for(int i=0;i<str.length;i++)
		{
			count=count+str[i];
			System.out.println(count);
		}
	}

}
