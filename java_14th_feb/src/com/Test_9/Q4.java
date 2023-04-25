package com.Test_9;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list. 

public class Q4 {

	public static void main(String[] args)
	{
		 ArrayList<String> myArrayList = new ArrayList<>();

	        myArrayList.add("Apple");
	        myArrayList.add("Banana");
	        myArrayList.add("Orange");
	        myArrayList.add("Mango");

	        System.out.println(myArrayList.get(2));
	    }
	}
