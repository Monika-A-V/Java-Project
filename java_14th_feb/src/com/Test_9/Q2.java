package com.Test_9;

import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in an array list (Show all the ways).
*/
public class Q2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");

		System.out.println(",,,using for loop,,,,");
		for(int i = 0; i < list.size(); i++)
		{
		  System.out.println(list.get(i));
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,");
		
		System.out.println(",,,,using for each loop,,,,");
        for(String element : list)
		{
		  System.out.println(element);
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
		 
		System.out.println(",,,,,using iterator,,,,,");
        Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
		  System.out.println(iterator.next());
		}



	}

}
