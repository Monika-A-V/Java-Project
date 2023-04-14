package com.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class SortIntegerArrayList {

	public static void main(String[] args) {

		List<Integer> l=new ArrayList<>();
		
		l.add(8);
		l.add(6);
		l.add(5);
		l.add(9);
		l.add(3);
		System.out.println(l);
		
		
		System.out.println("sorted arraylist");
		for (int i = 0; i < l.size() - 1; i++)
		{
		    for (int j = 0; j < l.size()-1; j++)
		    {
		        if (l.get(j) > l.get(j+1))
		        {
		            int temp = l.get(j);
		            l.set(j, l.get(j+1));
		            l.set(j+1, temp);
		        }
		    }
		}

		System.out.println(l);
	}}