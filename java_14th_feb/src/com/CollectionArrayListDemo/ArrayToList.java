package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {

	public static void main(String[] args) {

		String s[]= {"mumbai","pune","nasik","nagpur"};
		System.out.println(Arrays.toString(s));
		
		ArrayList<String> a=new ArrayList(Arrays.asList(s));
		for(String s1:a)
		{
			System.out.println(s1);
		}
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,");
		ArrayList<String> a1=new ArrayList();
		
		Collections.addAll(a1,s);
		System.out.println(a1);
		
		System.out.println(",,,,,manual add,,,,,,,");
		ArrayList<String> a2=new ArrayList();
		
		for(int i=0;i<s.length;i++)
		{
			a2.add(s[i]);
		}
		System.out.println(a2);
		}

}
