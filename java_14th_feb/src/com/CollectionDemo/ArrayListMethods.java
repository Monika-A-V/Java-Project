package com.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("goa");
		System.out.println(al);
		
		al.add(1,"nasik");
		System.out.println(al);
		
		al.set(0,"banglore");
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("pune");
		al1.add("gujrat");
		al1.add("goa");
		System.out.println(al1);
		
		al1.addAll(al);
		al1.addAll(0,al);
		System.out.println(al1);
		
		al1.remove(1);
		System.out.println(al1);
		
		al1.remove("goa");
		System.out.println(al1);
		
		/*al1.removeAll(al);
		System.out.println(al1);
		System.out.println(al);*/
		
		System.out.println(",,,,,,,,,,,,,,,,,");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("bhutan");
		al2.add("ahmednagar");
		al2.add("shimla");
		al2.add("banglore");
		System.out.println(al2);
		
		//al2.retainAll(al1);
		
		/*al2.addAll(al1);
		System.out.println(al2);
		al2.retainAll(al1);
		System.out.println(al2);
		System.out.println(al1);*/
		
		System.out.println(al.contains("banglore"));
		
		List<String>list=al.subList(1, 2);
		System.out.println(list);
		
		System.out.println(al);
		
		

		
	}

}
