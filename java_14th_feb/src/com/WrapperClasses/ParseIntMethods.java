package com.WrapperClasses;

public class ParseIntMethods {

	public static void main(String[] args) 
	{

		String input="4567";
		int i=Integer.parseInt(input);
		System.out.println("string is : "+i);

		String input1="4567.1";
		double d=Double.parseDouble(input1);
		System.out.println("string is : "+d);
		
		String input2="4567.1";
		float f=Float.parseFloat(input2);
		System.out.println("string is : "+f);
		
		String input3="4";
		byte b=Byte.parseByte(input3);
		System.out.println("string is : "+b);
		
		String input4="456";
		short s=Short.parseShort(input4);
		System.out.println("string is : "+s);
		
		String input5="4567";
		long l=Long.parseLong(input5);
		System.out.println("string is : "+l);
		
		String input6="1";
		boolean b1=Boolean.parseBoolean(input6);
		System.out.println("string is : "+b1);
	}

}
