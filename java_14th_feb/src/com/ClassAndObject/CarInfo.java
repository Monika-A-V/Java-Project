package com.ClassAndObject;

public class CarInfo 
{

	public static void main(String[] args)
	{
		GetterSetterCar g=new GetterSetterCar();
		g.setId(2);
		g.setName("BMW");
		g.setPrice(2000000);
		g.setColour("Black");
		
		System.out.println(g.getId()+" "+g.getName()+" "+g.getPrice()+" "+g.getColour());
		
		}

}
