package com.Test_7;

/*Write a Program to reverse a given string in place? (that means without using second
string)*/


public class Q3 {

	public static void main(String[] args) {

		        String str = "Hello, World!";
		        char ch[] = str.toCharArray();

		        int i = 0;
		        int j = ch.length - 1;

		        while (i < j)
		        {
		            char temp = ch[i];
		            ch[i] = ch[j];
		            ch[j] = temp;
		            i++;
		            j--;
		        }

		        String reversedStr = new String(ch);
		        System.out.println(reversedStr);
		    }
		}
