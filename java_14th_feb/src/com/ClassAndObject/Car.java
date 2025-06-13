package com.ClassAndObject;

public class Car 
{

	int id;
	String name;
	int price;
	String color;
	
	
	public static void main(String[] args)
	{
		Car c1=new Car();
		
		c1.id=2;
		c1.name="BMW";
		c1.price=5000000;
		c1.color="Black";
		
		System.out.println(c1.id+" "+c1.name+" "+c1.price+" "+c1.color);
		
		

Car c2=new Car();
		
		c2.id=2;
		c2.name="audi";
		c2.price=6000000;
		c2.color="white";
		
		System.out.println(c2.id+" "+c2.name+" "+c2.price+" "+c2.color);
		
		
		
		
Car c3=new Car();
		
		c3.id=2;
		c3.name="harrier";
		c3.price=3000000;
		c3.color="Black";
		
		System.out.println(c3.id+" "+c3.name+" "+c3.price+" "+c3.color);
	}

}
