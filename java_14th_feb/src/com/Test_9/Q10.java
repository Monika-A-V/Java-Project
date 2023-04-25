package com.Test_9;

import java.util.ArrayList;

//Write a java program to remove duplicate elements from ArrayList.

public class Q10 {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		
		al.add("apple");
		al.add("banana");
		al.add("orange");
		al.add("grape");
		al.add("grape");
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<>();
		for(String s:al)
		{
			if(!al1.contains(s))
			{
				al1.add(s);
			}
		}
		System.out.println(al1);
	}

}
