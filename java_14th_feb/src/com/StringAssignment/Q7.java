package com.StringAssignment;

//7. Write a Java program to trim leading white space characters in a 
//string.(using string function and without using string function)

public class Q7 {

	public static void main(String[] args) {

		        String str = "   Hello, World!";
		        
		        char[] charArray = str.toCharArray();
		        int len = charArray.length;
		        int st = 0;
		        
		        while ((st < len) && (charArray[st] <= ' '))
		        {
		            st++;
		        }
		        
		        String trimmedStr;
		        if (st > 0)
		        {
		            trimmedStr = str.substring(st);
		        } 
		        else 
		        {
		            trimmedStr = str;
		        }
		        
		        System.out.println("Original String: \"" + str + "\"");
		        System.out.println("Trimmed String: \"" + trimmedStr + "\"");

		        /*String str = "   Hello, World!";
		        
		        String trimmedStr = str.trim();
		        
		        System.out.println("Original String:" +str);
		        System.out.println("Trimmed String:" +trimmedStr);*/
		    }

		}

