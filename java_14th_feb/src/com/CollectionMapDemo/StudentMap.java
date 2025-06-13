package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Student
{
	int id ;
	String name;
	public Student(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "id=" + id + ", name=" + name ;
	}
}

public class StudentMap
{
	public static void main(String[] args)
	{
		HashMap<Integer,ArrayList<Student>> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=2; i++)
		{
			System.out.println("Enter marks as key");
			int marks=sc.nextInt();
			
			ArrayList<Student> al = new ArrayList<>();
			
			for(int j=1; j<=2; j++)
			{
				System.out.println("Enter stu id");
				int id = sc.nextInt();
				System.out.println("Enter stu name");
				String name = sc.next();
				
				al.add(new Student(id,name));
				
			}
			hm.put(marks, al);
		}
		
		 for(Entry<Integer, ArrayList<Student>> s : hm.entrySet()) 
		 {
			 if(s.getKey()<60) {
		  System.out.println(s.getKey()+" "+s.getValue());
			 }
		  }
		 System.out.println(".....................................");
		 
	   Iterator<Map.Entry<Integer, ArrayList<Student>>> itr = hm.entrySet().iterator();
	   
	   while(itr.hasNext())
	   {
		   
		   Map.Entry<Integer, ArrayList<Student>> entry = itr.next();
		   if(entry.getKey()>60) 
		   {
		   System.out.println(entry.getKey()+" "+entry.getValue());
		   }
	   }

	}}
