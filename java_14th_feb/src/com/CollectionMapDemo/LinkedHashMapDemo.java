package com.CollectionMapDemo;
import java.util.*;

import java.util.HashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(800,"nasik");
		hm.put(6,"pune");
		hm.put(9,"mumbai");
		hm.put(3,"nagpur");
		hm.put(5,"goa");
		System.out.println(hm);
		
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		LinkedHashMap <Integer,String> lm=new LinkedHashMap();
		lm.put(1,"pune");
		lm.put(4,"mumbai");
		lm.put(2,"nasik");
		lm.put(6,"nagpur");
		System.out.println(lm);
	}

}
