package com.ClassAndObject;

public class Student 
{
	int id;
	String name;
	double marks;

	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(s1.id+" "+s1.name+" "+s1.marks);
		
		
		s1.id=202;
		s1.name="monika";
		s1.marks=90.20;
		
		System.out.println(s1.id+" "+s1.name+" "+s1.marks);
		
		

	}

}
