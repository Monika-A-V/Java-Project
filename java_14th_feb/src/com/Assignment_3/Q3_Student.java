package com.Assignment_3;

//Create getId() method in Student class. call getId() method from 
//displayData method so that you know that one method can be called from 
//another method. Return id from getId() method and set that id to the 
//instance variable in displayData method.

public class Q3_Student {
	
	    private int id;
	    private String name;
	    private int age;

	    public Q3_Student(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    public int getId() {
	        return id;
	    }

	    public void displayData() {
	        int studentId = getId(); 
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        this.id = studentId;
	    }
	}



