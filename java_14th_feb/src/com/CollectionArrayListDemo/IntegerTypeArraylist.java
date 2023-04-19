package com.CollectionArrayListDemo;
import java.util.*;
public class IntegerTypeArraylist {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(7);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		System.out.println(a);
		
		System.out.println("even position");
		
		for(int i=0;i<a.size();i=i+2)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println();

		System.out.println("even elements");
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)%2==0)
			{
				System.out.print(a.get(i)+" ");
			}
		}
	}
}
