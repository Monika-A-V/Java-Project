package com.Test_8;
import java.util.ArrayList;
import java.util.List;

//) Write a java program to Remove duplicate elements from ArrayList
public class Q4 {

	public static void main(String[] args) 
	{

	            List<Integer> l = new ArrayList<Integer>();
		        l.add(1);
		        l.add(2);
		        l.add(3);
		        l.add(2);
		        l.add(4);
		        l.add(1);

		        System.out.println("List with duplicates: " + l);

		        List<Integer> listWithoutDuplicates = new ArrayList<Integer>();

		        for (Integer e : l)
		        {
		            if (!listWithoutDuplicates.contains(e))
		            {
		                listWithoutDuplicates.add(e);
		            }
		        }

		        System.out.println("List without duplicates: " + listWithoutDuplicates);
		    }
		}
