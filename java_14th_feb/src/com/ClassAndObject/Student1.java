package com.ClassAndObject;

public class Student1
{
    private int id;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public void acceptDetails(int id, String name, int marks1, int marks2, int marks3)
    {
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public float calculatePercentage() 
    {
        float total = marks1 + marks2 + marks3;
        float percentage = (total / 300) * 100;
        return percentage;
    }

    public void displayDetails()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }


	public static void main(String[] args) 
	{
		Student1 s=new Student1();
		s.acceptDetails(2,"monika",20,30,40);
		s.calculatePercentage();
		s.displayDetails();
		}

}

