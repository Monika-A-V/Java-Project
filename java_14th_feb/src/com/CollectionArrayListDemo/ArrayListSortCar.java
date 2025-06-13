package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>
{
	int id;
	String name;
	int price;
	String colour;
	
	
	Car(int id,String name,int price,String colour)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	public String toString()
	{
		return id+" "+name+" "+price+" "+colour;
	}
	public int compareTo(Car c)
	{
		//return c.id-this.id;
		if(this.id<c.id)
		{
			return 1;
		}
		else if(this.id>c.id)
		{
			return -1;
		}
		else
		{
			//return 0;
			
			return c.colour.compareTo(this.colour);
		}
	}
}
public class ArrayListSortCar {

	public static void main(String[] args)
	{
		ArrayList<Car> al=new ArrayList<>();
		
		al.add(new Car(10,"bmw",2000000,"black"));
		al.add(new Car(30,"audi",4000000,"red"));
		al.add(new Car(20,"harrier",5000000,"white"));
		al.add(new Car(10,"range rover",2000000,"brown"));
		
		for(Car c:al)
		{
			System.out.println(c);
		}
		System.out.println("sorted");
		Collections.sort(al);
		
		for(Car c:al)
		{
			System.out.println(c);
		}

	}

}
