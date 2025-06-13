package com.ClassAndObject;

public class StaticDemo 

{
	int x=10;
	static int y;
	
	static void DoAddition()
	{
		int y=20;
		StaticDemo s=new StaticDemo();
		System.out.println("Addition is = "+(s.x+y));
	}

	public static void main(String[] args) 
	{
		StaticDemo.DoAddition();

	}

}
