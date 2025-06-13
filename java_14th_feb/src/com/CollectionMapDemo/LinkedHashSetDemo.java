package com.CollectionMapDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		
		LinkedHashSet<String> ls=new LinkedHashSet<>();
		
		ls.add("red");
		ls.add("black");
		ls.add("yellow");
		ls.add("pink");
		ls.add("blue");
		ls.add("red");
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		
		ls.remove("pink");
		System.out.println(ls);
	}

}
