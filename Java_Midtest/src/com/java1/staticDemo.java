package com.java1;
public class staticDemo 
{
	static int a=1 ;
	
	static
	{
		a=2;
		System.out.println(a);
	}
	static void show()
	{
		int a=3;
		System.out.println(a);
		staticDemo s=new staticDemo();
		s.display();
	}
	void display()
	{
		System.out.println("i am static");
	}

	public static void main(String[] args) 
	{
    staticDemo.show();
	}

}
