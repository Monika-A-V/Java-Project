package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>
{
	int id;
	String name;
	int sal;
	
	Employee1(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		}
	public String toString()
	{
		return id+" "+name+" "+sal;
	}
	public int compareTo(Employee1 e)
	{
		//sort on sal in asc if sal is same then sort using id in asc order
		if(this.sal>e.sal)
		{
			return 1;
		}
		else if(this.sal<e.sal)
		{
			return -1;
		}
		else
		{
			return this.id-e.id;
		}
	}
}
public class ArrayListSortMethodComparable {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(89);
		al.add(56);
		al.add(43);
		al.add(21);
		al.add(48);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("sorted arraylist = " +al);
		
		
		ArrayList<String> al2=new ArrayList<>();
		al2.add("green");
		al2.add("blue");
		al2.add("black");
		al2.add("red");
	    System.out.println(al2);
	    
	    Collections.sort(al2);
	    System.out.println("sorted arraylist = " +al2);
	    
	    ArrayList<Employee1> list=new ArrayList<>();
	    list.add(new Employee1(1,"neha",20000));
	    list.add(new Employee1(2,"pooja",30000));
	    list.add(new Employee1(3,"pritee",40000));
	    list.add(new Employee1(4,"raj",30000));
	    
	    for(Employee1 e:list)
	    {
	    	System.out.println(e);
	    }
	    System.out.println(",,,,,,,,,,after,,,,,,,,,");
	    Collections.sort(list);
	    
	    for(Employee1 e:list)
	    {
	    	System.out.println(e);
	    }
		

		
	}

}
