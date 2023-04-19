package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenericArrayList {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		
		System.out.println(list.isEmpty());
		
		list.add("pune");
		list.add(3);
		list.add('p');
		list.add(56.7);
		
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.remove("pune");
		System.out.println(list);
		
		System.out.println();
		
		System.out.println(",,,,,,,,,for,,,,,,,,,,,,,,");
		for(int i=0;i<list.size();i++)
		{
		}
		System.out.println(list);
		
		
		System.out.println();
		
		
		System.out.println(",,,,,,for each,,,,,,,,,,");
		for(Object o:list)
		{
			System.out.println(o);
		}
		
		System.out.println();
		
		System.out.println("by iterator");
		
		Iterator<Object>itr=list.iterator();
		
		for(Object o1:list)
		{
			System.out.println(o1);
		}
			
		}

}
