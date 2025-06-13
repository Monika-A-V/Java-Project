package com.Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {

	static void mapOperation(ArrayList<Integer> list)
	{
		Function<Integer, Integer> f1= n->n*n;
		
		List<Integer> sqlist= list.stream().map(f1).collect(Collectors.toList());
		
		System.out.println(sqlist);
	}
	
	static void filterOperation(ArrayList<Integer> list)
	{
		Predicate<Integer> p1= n-> n%2==0; 
		
		List<Integer> evenOddlist= list.stream().filter(p1).collect(Collectors.toList());
		}
		
		static void mapfilterOperation(ArrayList<Integer> list)
		
	{
		
		Function<Integer, Integer> f1= n->n*n;
		
		Predicate<Integer> p1= n-> n%2==0; 
		
		List<Integer> evenOddlist= list.stream().map(f1).filter(p1).collect(Collectors.toList());
		
		System.out.println(evenOddlist);
		System.out.println(evenOddlist);
		
		
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(8,9,10,2,5,6));
		mapOperation(al);
		filterOperation(al);
		mapfilterOperation(al);
	}

}
