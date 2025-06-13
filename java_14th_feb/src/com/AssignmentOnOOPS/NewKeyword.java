package com.AssignmentOnOOPS;


class Student1
{
    int id;
    String name;
}
public class NewKeyword 
{

	public static void main(String[] args)
	{
	
		        Student1 s1 = new Student1();
		        s1.id = 1;
		        s1.name = "Monika";
		        Student1 s2 = s1;
		        System.out.println("s1.id = " + s1.id + ", s1.name = " + s1.name); 
		        System.out.println("s2.id = " + s2.id + ", s2.name = " + s2.name);
		        s2 = new Student1();
		        s2.id = 2;
		        s2.name = "Pooja";
		        System.out.println("s1.id = " + s1.id + ", s1.name = " + s1.name);
		        System.out.println("s2.id = " + s2.id + ", s2.name = " + s2.name); 
		    }
		}
