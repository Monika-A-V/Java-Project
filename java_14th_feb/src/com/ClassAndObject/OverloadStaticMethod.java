package com.ClassAndObject;

public class OverloadStaticMethod 
{
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void add(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		OverloadStaticMethod s=new OverloadStaticMethod();
		s.add(1,2);
		s.add(1);

	}

}
