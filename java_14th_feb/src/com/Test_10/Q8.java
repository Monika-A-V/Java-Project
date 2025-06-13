package com.Test_10;


abstract class Abs1 {
int num ;
public abstract void move();
}

class Abs2 extends Abs1
{
	
	public void move()
	{
		System.out.println("i am moving");
	}
public void show()
{ 
	System.out.println("in show method");
}
}

public class Q8 {

	public static void main(String[] args) 
	{
		 Abs2 abs = new Abs2();
		 abs.move();
		 abs.show();
		}

}
