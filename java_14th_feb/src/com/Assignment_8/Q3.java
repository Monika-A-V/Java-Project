package com.Assignment_8;

/*There is Student class { int id , string name ,Boolean isspecial , Course c } . 
Course {String cname , int fees } Assume that there is array of 10 student 
objects. Write a program to set isspecial to be true if course fee of that 
student is more than 50000*/


class Student {
    int id;
    String name;
    boolean isspecial;
    Course c;

    public Student(int id, String name, boolean isspecial, Course c) {
        this.id = id;
        this.name = name;
        this.isspecial = isspecial;
        this.c = c;
    }

    public void setIsspecial(boolean isspecial) {
        this.isspecial = isspecial;
    }
}
    class Course
    {
    	String cname;
    	int fees;
    	
    	Course(String cname,int fees)
    	{
    		this.cname=cname;
    		this.fees=fees;
    	}
    }
public class Q3 {

	public static void main(String[] args) 
	{
		
		 Student[] s = new Student[2];
	     s[0] = new Student(1, "monika", false,new Course("math",30000));
	     s[1] = new Student(2, "pooja", false,new Course("physics",20000));
	        		
	        for(int i=0;i<s.length;i++)
	        {
	                System.out.println("ID: " + s[i].id);
	                System.out.println("Name: " + s[i].name);
	                System.out.println("Is Special: " + s[i].isspecial);
	                System.out.println("Course: " + s[i].c.cname);
	                System.out.println("Fees: " + s[i].c.fees);
	                System.out.println();
	            }
	        }
}
