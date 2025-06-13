package com.Test_9;

import java.util.ArrayList;

//Write a Java program to insert an element into the array list at the first position

public class Q3 {

	public static void main(String[] args) {

		 ArrayList<String> list = new ArrayList<String>();
	      
	      list.add("Java");
	      list.add("Python");
	      list.add("Ruby");
	      
	      System.out.println("Original List: " + list);
	      
	      list.add(1, "C++");
	      
	      System.out.println("List after adding element at first position: " + list);
	   }
	}
	
