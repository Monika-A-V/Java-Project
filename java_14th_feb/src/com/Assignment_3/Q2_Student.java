package com.Assignment_3;

//id, name in student class. assign value to id, name there Itself and in 
//main method print values then change value of instance variables and again 
//print the values (Observe you cannot access id directly without creating 
//object)

public class Q2_Student {
	
	    public int id = 1;
	    public String name = "John";

	    public static void main(String[] args)
	    {
	        Q2_Student student = new Q2_Student();

	        System.out.println("ID: " + student.id);
	        System.out.println("Name: " + student.name);

	        student.id = 2;
	        student.name = "Mary";

	        System.out.println("ID: " + student.id);
	        System.out.println("Name: " + student.name);
	    }
	}

	
