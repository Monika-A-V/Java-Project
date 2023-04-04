package com.StringDemo;

public class StringComparisonDemo
{
	public static void compareByCompareTo(String s1,String s2)
	{
		int i=s1.compareTo(s2);
		System.out.println(i);
		
	}
	
	public static void compareByEquals(String s1,String s2)
	{
		boolean isSame=s1.equals(s2);
		System.out.println(isSame);
		
		System.out.println(s1.equalsIgnoreCase(s2));

		
	}

	public static void main(String[] args) {

		String s1="Hello";
		String s2="hEllo";
		
		StringComparisonDemo.compareByCompareTo(s1, s2);
		StringComparisonDemo.compareByEquals(s1, s2);
	}

}
