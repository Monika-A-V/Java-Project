package com.ClassAndObject;

public class GetterSetterCar 
{
	
	int id;
	String name;
	int price;
	String colour;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColour()
	{
		return colour;
	}

}