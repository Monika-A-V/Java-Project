package com.CollectionMapDemo;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<>(new MyCom1());
		ts.add(9);
		ts.add(3);
		ts.add(5);
		ts.add(1);
		ts.add(6);
		ts.add(2);
		System.out.println(ts);
		
		//NavigableSet n=ts.descendingSet();
		//System.out.println(n);
		
		System.out.println(ts.ceiling(3));
		System.out.println(ts.ceiling(2));
		System.out.println(ts.first());
		//System.out.println(ts.subSet(3,6));
		//System.out.println(ts.subSet(3,true,6,false));
		System.out.println(ts.tailSet(3));
	}

}

class MyCom1 implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		return o2-o1;
	}
}