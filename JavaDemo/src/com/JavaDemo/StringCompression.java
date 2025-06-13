package com.JavaDemo;

public class StringCompression 
{

	public static void main(String[] args)
	{
		String s="aaaabbbcccddaaba";
		int count=0;
		String op1="";
		int j=0;
		for(int i=0;i<s.length();i=j)
		{
			count=1;
			char temp=s.charAt(i);
			for(j=i+1;i<s.length();j++)
			{
				if (temp==s.charAt(i))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			op1=op1+s.charAt(i)+count;
		}
		System.out.println("compresion l= " +op1);
		
		char ch[]=op1.toCharArray();
		String op2="";
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				sum=0;
				boolean isVisited=false;
				for(int d=i-1;d>=0;d--)
				{
					if(ch[i]==ch[d])
					{
						isVisited=true;
					}
				}
				if(isVisited==false)
				{
					for(int k=0;k<ch.length;k++)
					{
						if(ch[i]==ch[k])
						{
							sum=sum+Character.getNumericValue(ch[k+1]);
							
						}
					}
					op2=op2+ch[i]+sum;
				}
			}
		}
		
	System.out.println(op2);
}
	
}
