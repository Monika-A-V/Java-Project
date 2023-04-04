package com.Assignment_3;

//create class Student and create 2 objects of Student using new keyword

public class Q1_Student 
{
	
	    public String name;
	    public int id;
	    
	    public Q1_Student(String name, int id) 
	    {
	        this.name = name;
	        this.id = id;
	    }
	    
	    public static void main(String[] args)
	    {
	        Q1_Student s1 = new Q1_Student("Monu", 12345);
	        Q1_Student s2 = new Q1_Student("Sonu", 67890);
	        
	        
	        System.out.println("Student 1 - Name: " + s1.name + ", ID: " + s1.id);
	        System.out.println("Student 2 - Name: " + s2.name + ", ID: " + s2.id);
	    }
	}



