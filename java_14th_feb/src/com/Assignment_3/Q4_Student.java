package com.Assignment_3;

//Add display method inside Student class change values of id, name in that 
//method & also print the changed values in same method. Call display 
//method from main method.

public class Q4_Student {
	
	    private int id;
	    private String name;

	    public Q4_Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public void display() {
	        this.id = 1;
	        this.name = "mona";

	        System.out.println("New ID: " + this.id);
	        System.out.println("New Name: " + this.name);
	    }

	    public static void main(String[] args) {
	        Q4_Student student = new Q4_Student(101, "pooja");
	        student.display();
	    }
	}



