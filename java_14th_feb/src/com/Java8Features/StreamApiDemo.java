package com.Java8Features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {

		ArrayList<String> names= new ArrayList<>();
		names.add("Shuruti");
		names.add("Rushikesh");
		names.add("Monika");
		names.add("Preeti");
		
		Stream<ArrayList<String>> s1= Stream.of(names);
		
		System.out.println(s1);
		
		s1.forEach(n->System.out.println(n));
		
	}

}
