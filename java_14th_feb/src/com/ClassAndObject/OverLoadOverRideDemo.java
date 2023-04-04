package com.ClassAndObject;

class AdditionTest
{
	public void Addition(int a,int b)
	{
		System.out.println("addition is : " +(a+b));
	}
	public void Addition(int a,int b,int c)
	{
		System.out.println("addition is : " +(a+b+c));
	}
}
class Main extends AdditionTest
{
	public void Addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void Addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
public class OverLoadOverRideDemo
{
     public static void main(String[] args) 
	{	 
		 AdditionTest a1=new Main();
		 a1.Addition(9,4);
		 a1.Addition(1,6,3);
		 a1.Addition(4,1,6);
		
		 AdditionTest b=new AdditionTest();
		 b.Addition(2,12);
		 b.Addition(1,4,9);

	}

}
