package com.CollectionMapDemo;

import java.util.HashMap;
import java.util.Map;

class Car
{
	int modelno;
	String cname;
	String ccolour;
	
	public Car(int modelno, String cname, String ccolour) 
	{
		super();
		this.modelno = modelno;
		this.cname = cname;
		this.ccolour = ccolour;
	}

	@Override
	public String toString() 
	{
		return "Car [modelno=" + modelno + ", cname=" + cname + ", ccolour=" + ccolour + "]";
	}
	}
public class HashMapCarAsKeyPrizeAsValue 
{

	public static void main(String[] args)
	{
		HashMap<Car,Integer> hm=new HashMap<>();
		
		hm.put(new Car(12,"fortuner","black"),3000000);
		hm.put(new Car(13,"harrier","white"),4000000);
		hm.put(new Car(15,"range rover","blue"),6000000);
		
		for(Map.Entry<Car,Integer> m:hm.entrySet())
		{
			System.out.println(m.getKey() + " -->" + m.getValue());
		}
		}

}
