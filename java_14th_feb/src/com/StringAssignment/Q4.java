package com.StringAssignment;

//4. Write a Java program to find second occurrence of a character in a given string

public class Q4 {

	public static void main(String[] args) {

		        String str = "hello world";
		        char ch = 'l';
		        int count = 0;
		        int secondIndex = 0;
		        boolean foundSecondOccurrence = false;
		        for (int i = 0; i < str.length(); i++) 
		        {
		            if (str.charAt(i) == ch) 
		            {
		                count++;
		                if (count == 2) 
		                {
		                    secondIndex = i;
		                    foundSecondOccurrence = true;
		                    break;
		                }
		            }
		        }
		        if (foundSecondOccurrence)
		        {
		            System.out.println("Second occurrence of " + ch + " is at index " + secondIndex);
		        } else {
		            System.out.println(ch + " does not occur twice in the string");
		        }
		    }
		}

