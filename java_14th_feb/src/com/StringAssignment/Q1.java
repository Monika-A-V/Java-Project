package com.StringAssignment;

/*Create Strings with new operator and without new.
a. Create 2 string using literal and Compare string using == see same 
reference is there.
b. Create 2 string using new and Compare string using == see different 
reference is there.*/

public class Q1
{

	public static void main(String[] args) 
	{

		String s="mona";
		String s1="mona";
	    System.out.println(s==s1);
	    
	    
	    String s2=new String("mona");
	    String s3=new String("mona");
	    System.out.println(s2==s3);
		
	}

}

