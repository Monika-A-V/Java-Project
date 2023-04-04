package com.Test_3;

//	What will be Output?

class Animal1
{
	String name = "animal";

	String makeNoise() 
	{
		return "generic noise";
	}
}

class Dog1 extends Animal1 
{
	String name ;

	String show() 
	{
		return name;
	}
}

public class Test_9 
{
	public static void main(String[] args)
	{
		Dog1 a = new Dog1();
		System.out.println(a.show());

	}
}

			  