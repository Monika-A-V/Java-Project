package com.CollectionMapDemo;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCreation
{

	public static void main(String[] args)
	{
		Queue<String> q=new LinkedList();
		q.add("pune");
		q.add("mumbai");
		q.offer("nasik");
		q.add("pune");
		System.out.println(q);
		
		Queue<Integer> p=new PriorityQueue<>(new MyQueue());
	    p.add(7);
		p.add(4);
		p.add(67);
		p.add(2);
		p.add(86);
		p.add(3);
		System.out.println(p);
		
		p.poll();
		System.out.println(p);
		p.poll();
		System.out.println(p);
}

}
class MyQueue implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		return o2-o1;
		
	}
}
