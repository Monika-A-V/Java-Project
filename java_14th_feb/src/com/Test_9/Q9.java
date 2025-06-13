package com.Test_9;
import java.util.ArrayList;

public class Q9 {

	public static void main(String[] args)
	{

		        ArrayList<String> listWithDuplicates = new ArrayList<String>();
		        listWithDuplicates.add("apple");
		        listWithDuplicates.add("banana");
		        listWithDuplicates.add("orange");
		        listWithDuplicates.add("apple");
		        listWithDuplicates.add("grape");
		        listWithDuplicates.add("banana");
		        
		        System.out.println("ArrayList with duplicates: " + listWithDuplicates);

		        ArrayList<String> listWithoutDuplicates = new ArrayList<String>();
		        
		        for (String element : listWithDuplicates) 
		        {
		            if (!listWithoutDuplicates.contains(element)) 
		            {
		                listWithoutDuplicates.add(element);
		            }
		        }

		        System.out.println("ArrayList without duplicates: " + listWithoutDuplicates);
		    }
		}
