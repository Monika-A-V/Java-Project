package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		
		al.add("blue");
		al.add("red");
		al.add("black");
		System.out.println(al);
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("by iterator");
		
		Iterator<String> i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("by listIterator");
		
		
		ListIterator<String> li=al.listIterator(al.size());
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
