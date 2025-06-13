package com.Test_7;

//Write a Program to show the use of StringBuffer and StringBuilder functions?

public class Q6 
{

	public static void main(String[] args)
	{
		        StringBuffer stringBuffer = new StringBuffer();
		        stringBuffer.append("Hello ");
		        stringBuffer.append("world");
		        stringBuffer.append("!");
		        String result1 = stringBuffer.toString();
		        System.out.println(result1); 

		        String input = "hello world";
		        StringBuilder stringBuilder = new StringBuilder();
		        stringBuilder.append(input);
		        stringBuilder.reverse();
		        String result2 = stringBuilder.toString();
		        System.out.println(result2);
		    }
		}
