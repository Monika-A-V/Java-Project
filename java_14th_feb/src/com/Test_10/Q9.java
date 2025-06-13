package com.Test_10;


class Shape
{
protected void draw() 
{
System.out.println("I am drawing shape");
}
}
class Triangle extends Shape 
{
public void draw() 
{
System.out.println("I am drawing triangle");
}
}

public class Q9 {

	public static void main(String[] args)
	{
		Shape t = new Triangle(); 
		t.draw();
	}
	}