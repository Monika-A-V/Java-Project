package com.CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args)
	{

                ArrayList<Integer> arrayList = new ArrayList<>();
		        arrayList.add(1);
		        arrayList.add(2);
		        arrayList.add(3);
                System.out.println(arrayList);
		        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

		        for (int element : linkedList)
		        {
		            System.out.println(element);
		        }
		    }
		}

	
