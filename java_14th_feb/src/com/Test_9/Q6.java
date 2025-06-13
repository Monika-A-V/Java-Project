package com.Test_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*WAP to convert ArrayList to array in 2 different ways and array 
to ArrayList in 2 different ways*/

public class Q6 {

	public static void main(String[] args)
	{
		 ArrayList<Integer> al=new ArrayList<>();
		  al.add(2);
		  al.add(3);
		  al.add(4);
		  al.add(6);
		  al.add(9);
		  System.out.println(al);
		  
		  System.out.println(",,,,,,,,List to Array1,,,,,,,");
		  Integer arr[]=al.toArray(new Integer[al.size()]);
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i]);
		  }
		  
		  System.out.println(",,,,,,,List to Array2,,,,,,,");
		  Integer a[]=new Integer[al.size()];
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=al.get(i);
		  }
			  System.out.println(Arrays.toString(a));
			  
			  System.out.println(";;;;;;;;;;;;;;;;;;;;Array to Arraylist conversion;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			  
			  System.out.println("Array is:");
			  int c[] = new int[] {5, 1, 2, 6, 3, 8, 4};
			  Integer s[] = new Integer[c.length];
			  for (int i = 0; i < c.length; i++)
			  {
			      s[i] = Integer.valueOf(c[i]);
			  }
			  System.out.println(Arrays.toString(c));

			  System.out.println(",,,,,,,Array to ArrayList,,,,,,,,,,,,,,,,,,");
			  ArrayList<Integer> m = new ArrayList<>(Arrays.asList(s));
			  for (Integer h : m)
			  {
			      System.out.println(h);
			  }
			  
			  
			  String s1[]= {"mumbai","pune","nagpur","ahmednagar"};
			  System.out.println(Arrays.toString(s1));
			  
			  ArrayList<String> a2=new ArrayList<>(Arrays.asList(s1));
			  for(String w:a2)
			  {
				  System.out.println(w);
			  }
			  
			  
			  System.out.println(",,,,,,using addAll,,,,,,,");
			  ArrayList<String> a1=new ArrayList();
				
				Collections.addAll(a1,s1);
				System.out.println(a1);
				
				System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
				
				System.out.println(",,,,,manual add,,,,,,,");
				ArrayList<String> a21=new ArrayList();
				
				for(int i=0;i<s1.length;i++)
				{
					a21.add(s1[i]);
				}
				System.out.println(a21);
				}
			  }