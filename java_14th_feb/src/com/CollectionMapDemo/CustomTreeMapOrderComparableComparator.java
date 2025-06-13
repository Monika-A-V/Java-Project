package com.CollectionMapDemo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Order implements Comparable<Order>
{
	int oid;
	String product;
	int qty;
	int price;
	
	public Order(int oid, String product, int qty, int price) 
	{
		super();
		this.oid = oid;
		this.product = product;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Order [oid=" + oid + ", product=" + product + ", "
				+ "qty=" + qty + ", price=" + price + "]";
	}
	
	public int compareTo(Order o)
	{
		//return this.qty-o.qty;
		//return this.product.compareTo(o.product);
		return this.price-o.price;
	}
	}

class MyComPrice implements Comparator<Order>
{
	public int compare(Order o1,Order o2)
	{
		if(o1.price==o2.price)
		{
			return o1.product.compareTo(o2.product);
		}
		else
		{
			return o2.price-o1.price;
		}
	}
}
public class CustomTreeMapOrderComparableComparator {

	public static void main(String[] args) 
	{

		TreeMap<Order,String> tm=new TreeMap<Order,String>(new MyComPrice());
		tm.put(new Order(1,"pendrive",20,2000),"shiftment done");
		tm.put(new Order(2,"shirt",30,1000),"delivered");
		tm.put(new Order(3,"keyboard",40,500),"delivered");
		tm.put(new Order(4,"pants",50,300),"delivered");
		
		for(Map.Entry<Order,String> m:tm.entrySet())
		{
			System.out.println(m.getKey()+" -->" + m.getValue());
		}
		}}