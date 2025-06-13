package com.Java8Features;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerCollection {

	public static void main(String[] args)
	{
		ArrayList<String> names= new ArrayList<>();
		
		names.add("Shuruti");
		names.add("Rushikesh");
		names.add("Monika");
		names.add("Preeti");
		
		
		Consumer<String> c1= t->System.out.println(t+" :"+t.length());
		
		System.out.println("Length of names in arraylist is:");
		
		names.forEach(c1);
		
		System.out.println("UpperCase :");
		
		names.forEach((t)->System.out.println(t.toUpperCase()));
	

	}

}
