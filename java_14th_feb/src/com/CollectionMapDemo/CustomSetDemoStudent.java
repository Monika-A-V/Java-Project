package com.CollectionMapDemo;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

class Student3
{
	int id;
	String name;
	int marks;
	
	public Student3(int id, String name, int marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public int hashCode()
	{
		//return id;
		return name.hashCode();
	}
	public boolean equals(Object o)
	{
		Student3 s=(Student3) o;
		if(this.name.equals(s.name))
		{
			return true;
		}
		else
		{
			return false;
		}
		/*if(this.id==s.id)
		{
			return true;
		}
		else
		{
			return false;
		}*/
	}
}
public class CustomSetDemoStudent {

	public static void main(String[] args)
	{
		LinkedHashSet<Student3> ls=new LinkedHashSet<>();
		ls.add(new Student3(2,"mona",90));
		ls.add(new Student3(5,"pooja",80));
		ls.add(new Student3(6,"mona",70));
		ls.add(new Student3(2,"anvi",60));
		
		for(Student3 s:ls)
		{
			System.out.println(s);
		}
		}}
