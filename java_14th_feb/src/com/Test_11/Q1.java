package com.Test_11;
import java.util.ArrayList;


/*An arraylist has strings ‘A+2’, ‘B+12’, ‘D+4’,’A+5’,’A+8’ and so on. 
Create a two new arraylist one which Contain Alphabet and another list 
contains respected integers.*/


public class Q1 {

	public static void main(String[] args) {

		        ArrayList<String> arrayList = new ArrayList<>();
		        arrayList.add("A+2");
		        arrayList.add("B+12");
		        arrayList.add("D+4");
		        arrayList.add("A+5");
		        arrayList.add("A+8");

		        ArrayList<String> alphabetsList = new ArrayList<>();
		        ArrayList<Integer> integersList = new ArrayList<>();

		        for (String str : arrayList) 
		        {
		            String[] parts = str.split("\\+");
		            alphabetsList.add(parts[0]);
		            integersList.add(Integer.parseInt(parts[1]));
		        }

		        System.out.println("Alphabets List: " + alphabetsList);
		        System.out.println("Integers List: " + integersList);
		    }
		}