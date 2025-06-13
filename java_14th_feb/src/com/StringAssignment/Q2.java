package com.StringAssignment;

//2. Write a code to prove that strings are immutable in java?


public class Q2 {

	public static void main(String[] args) {

		        String str = "Hello";
		        System.out.println("Original String: " + str);
		        
		        str.concat(" World");
		        System.out.println("String after concatenation: " + str);
		        
		        str.toUpperCase();
		        System.out.println("String after uppercasing: " + str);
		        
		        str.replace('o', 'a');
		        System.out.println("String after replacement: " + str);
		    }
		}

	