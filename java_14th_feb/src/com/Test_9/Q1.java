package com.Test_9;

import java.util.ArrayList;

/*Write a Java program to create a new array list, 
 add some colours (string) and print out the collection.
*/
public class Q1 {

	public static void main(String[] args) {

		 ArrayList<String> colors = new ArrayList<>();

	        colors.add("red");
	        colors.add("green");
	        colors.add("blue");
	        colors.add("yellow");

	        System.out.println("List of Colors:");
	        for (String color : colors) 
	        {
	            System.out.println(color);
	        }
	    }
	}
