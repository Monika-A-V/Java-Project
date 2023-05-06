package com.Test_10;

interface Car 
{
public void drive();
}
class Swift implements Car 
{
public void drive()
{ System.out.println("I am driving");
}
}
public class Q10 
{

	public static void main(String[] args)
	{
		Car car = new Swift(); car.drive();
	}
}
