package com.CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<>();
		
		list.add("red");
		list.add("black");
		list.add("green");
		list.add("blue");
		list.add("pink");
		System.out.println(list);
		
		//System.out.println(list.remove());
		//System.out.println(list);
		
		//System.out.println(list.peek());
		//System.out.println(list);
		
		//System.out.println(list.poll());
		//System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		System.out.println(list.removeFirst());
		
		System.out.println(list.pollFirst());
	}

}
