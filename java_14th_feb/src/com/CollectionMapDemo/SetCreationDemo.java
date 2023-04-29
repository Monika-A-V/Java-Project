package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetCreationDemo {

	public static void main(String[] args) {

		HashSet<Integer> s=new HashSet<>();
		
		s.add(10);
		s.add(89);
		s.add(null);
		s.add(55);
		s.add(99);
		s.add(null);
		
		for(Integer i:s)
		{
			System.out.println(i);
		}
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,");
	
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("/////////////////////////////////////");
		
		ArrayList<String> al=new ArrayList<>();
		al.add("goa");
		al.add("mumbai");
		al.add("nagpur");
		al.add("goa");
	    System.out.println(al);
	    
	    HashSet<String> hs=new HashSet(al);
	    System.out.println(hs);
	}

}
