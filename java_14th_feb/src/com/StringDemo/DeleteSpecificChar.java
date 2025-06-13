package com.StringDemo;

public class DeleteSpecificChar {

	public static void main(String[] args) {

		String s="monika";
		char delete='k';
		char ch[]=s.toCharArray();
		int index=0;
		for(int i=0;i<ch.length;i++)
		{
			if(delete==(ch[i]))
			{
				continue;
			}
			ch[index]=ch[i];
			System.out.println(ch[i]);
		}
		
	}

}
