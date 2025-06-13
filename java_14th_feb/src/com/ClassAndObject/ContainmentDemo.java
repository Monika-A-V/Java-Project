package com.ClassAndObject;

class Nib{
	String type;
	int price;
	
	public Nib(String type,int price)
	{
		this.type=type;
		this.price=price;
	}
	public String toString()
	{
		return type+" "+price;
	}
}
class Pen
{
	String name;
	String color;
	String type;
	Nib n;
	
	public Pen(String name,String color,String type,Nib n)
	{
		this.name=name;
		this.color=color;
		this.type=type;
		this.n=n;
	}
	public String toString()
	{
		return name+" "+color+" "+type+" "+n;
	}
}
class Bag
{
	int bid;
	String color;
	int price;
	Pen p;
	
	public Bag(int bid,String color,int price,Pen p)
	{
		this.bid=bid;
		this.color=color;
        this.price=price;
        this.p=p;
	}
	public String toString()
	{
		return bid+" "+color+" "+price+" "+p;
	}
}
public class ContainmentDemo
{

	public static void main(String[] args)
	{
		Pen p=new Pen("Trimax","blue","gel",new Nib("point",50));
		Bag b=new Bag(13,"Black",40,p);
		System.out.println(b);
		

	}

}
