package com.ClassAndObject;

public class Product
{

	String name;
	int quantity;
	int price;
	
	public void assignDetails(String n,int q,int p)
	{
		name=n;
		quantity=q;
		price=p;
	}
	public void displayDetails()
	{
		System.out.println(name+" "+quantity+" "+price);
	}
	public static void main(String[] args)
	{
		
       Product p=new Product();
       p.assignDetails("ram", 1 , 20);
       p.displayDetails();
	}

}
