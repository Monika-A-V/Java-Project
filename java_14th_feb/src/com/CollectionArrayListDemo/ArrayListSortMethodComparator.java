package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int id;
	String name;
	int marks;
	
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
}
public class ArrayListSortMethodComparator {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(new Student(1,"pooja",67));
		al.add(new Student(2,"dev",87));
		al.add(new Student(3,"raj",98));
		al.add(new Student(4,"sanju",77));
		//System.out.println(al);
		
		for(Student s:al)
		{
			System.out.println(s);
		}
		
        System.out.println(",,,,,,Id Comparator,,,,,,,,,");
        Collections.sort(al,new IdComparator());
        
        for(Student s:al)
        {
        	System.out.println(s);
        }
        
        System.out.println();
        
        System.out.println(",,,,,,Name Comparator,,,,,,,,,");
        Collections.sort(al,new NameComparator());
        for(Student s:al)
        {
        	System.out.println(s);
        }
        
        System.out.println();
        
        System.out.println(",,,,,MarksComparator,,,,,,,,,,");
        Collections.sort(al,new MarksComparator());
        for(Student s:al)
        {
        	System.out.println(s);
        }
        
	}

}

class IdComparator implements Comparator<Student>
{
	public int compare(Student o1,Student o2)
	{
		return o1.id-o2.id;
	}
}
class NameComparator implements Comparator<Student>
{
	public int compare(Student o1,Student o2)
	{
		return o1.name.compareTo(o2.name);
	}
}
class MarksComparator implements Comparator<Student>
{
	public int compare(Student o1,Student o2)
	{
	return o1.marks-o2.marks;
}
}
