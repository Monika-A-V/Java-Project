package com.CollectionMapDemo;
import java.util.Comparator;
import java.util.PriorityQueue;

class DescendingOrderComparator implements Comparator<String>
{
    public int compare(String s1, String s2)
    {
        return s2.compareTo(s1);
    }
    }
public class PriorityQueueStringDescending
{

	public static void main(String[] args) 
	{
		
		PriorityQueue<String> pq = new PriorityQueue<>(new DescendingOrderComparator());

        pq.add("yellow");
        pq.add("skyblue");
        pq.add("red");
        pq.add("black");

        while (!pq.isEmpty()) 
        {
            System.out.println(pq.poll());
        }
    }
}

