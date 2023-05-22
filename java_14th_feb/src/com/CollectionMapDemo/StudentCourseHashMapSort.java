package com.CollectionMapDemo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Student31
{
	int id;
	String name;
	
	Student31(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
class Course3
{
	String name;
	int fees;
	
	Course3(String name,int fees)
	{
		this.name=name;
		this.fees=fees;
	}
	public String toString()
	{
		return name+" "+fees;
	}
	
}
public class StudentCourseHashMapSort {

	public static void main(String[] args) 
	{
		HashMap<Student31,Course3> hm=new HashMap<>();
		
		hm.put(new Student31(1,"pooja"),new Course3("java",40000));
		hm.put(new Student31(2,"mona"),new Course3("php",30000));
		hm.put(new Student31(3,"preeti"),new Course3(".net",50000));
		hm.put(new Student31(4,"raj"),new Course3("sql",20000));
		hm.put(new Student31(5,"soma"),new Course3("c#",10000));
		
		System.out.println(hm);
		
		for(Map.Entry<Student31,Course3> hm1:hm.entrySet())
		{
			System.out.println(hm1.getKey()+" "+hm1.getValue());
		}
		
		
		/*System.out.println("sorting ascending order name");
		TreeMap<Student31,Course3> tm=new TreeMap<>(hm);
		System.out.println(tm);*/
		
		
		 System.out.println("------sorting desceding order name");
		 TreeMap<Student31,Course3> ts1=new TreeMap<Student31,Course3>(new SortingName());
		 ts1.putAll(hm);
		 System.out.println(ts1);

		

	}

}

class SortingName implements Comparator<Student31> {

	@Override
	public int compare(Student31 o1, Student31 o2) {
		return o2.name.compareTo(o1.name);
	}

}
