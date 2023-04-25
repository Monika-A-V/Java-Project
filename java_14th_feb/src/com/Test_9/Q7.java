package com.Test_9;

import java.util.ArrayList;

//Write a program to sort ArrayList by decending without using sort method
//and without converting into array.

public class Q7 {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(60);
		al.add(30);
		al.add(70);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=al.size()-1;j>i;j--)
			{
				if(al.get(i)>al.get(j))
				{
					int temp=al.get(i);
					al.set(i,al.get(j));
					al.set(j,temp);
				}
			}
		}
		for(int i:al)
		{
			System.out.println(i);
		}
	}

}
