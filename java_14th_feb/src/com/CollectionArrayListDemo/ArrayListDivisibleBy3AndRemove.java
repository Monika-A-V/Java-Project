package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDivisibleBy3AndRemove {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		
		al.add(6);
		al.add(5);
		al.add(9);
		al.add(8);
		al.add(3);
		al.add(4);
		al.add(11);
		//System.out.println(al);
		
		/*for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%3==0)
			{
				System.out.println(al.get(i));
			}
		}*/
		
		/*for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%3==0)
			{
				al.remove(i);
			}
		}
			System.out.println(al);*/
		
		Iterator<Integer> itr=al.iterator();
		
			while(itr.hasNext())
			{
				int num=itr.next();
				if(num%3==0)
				{
					itr.remove();
				}
			}
		System.out.println(al);
				
		}
	}

