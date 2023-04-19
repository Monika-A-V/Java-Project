package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int sal;
	
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
		
		public String toString()
		{
			return id+" "+name+" "+sal;
			}
		public int compareTo(Employee e)
		{
			//return e.id-this.id;//asc
			
			if(this.id>e.id)
			{
				return -1;//dec
			}
			else if(this.id<e.id)
			{
				return 1;//asc
			}
			else
			{
				return 0;//same
			
			//return this.name.compareTo(e.name);//asc
			//return e.name.compareTo(this.name);//des
			
		}}
	}
public class CustomArrayList
{
    public static void main(String[] args)
	{
		ArrayList<Employee> al=new ArrayList();
		//al.add(new Employee(101,"pooja",201220));
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=4;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter salary");
			int sal=sc.nextInt();
			
			al.add(new Employee(id,name,sal));
		}
		System.out.println(",,,,,,,,,,,list is,,,,,,,,,,,,,,,,,");
		System.out.println(al);
		
		System.out.println(",,,,,,,before,,,,,,,,,,,,");
		for(Employee e:al)
		{
			System.out.println(e);
		}
		System.out.println(",,,,,,,,,,after,,,,,,,,,,,,,,,,,,,");
		Collections.sort(al);
		
		for(Employee e:al)
		{
		}
		System.out.println(al);

		
		
		/*Iterator<Employee> i1=al.iterator();
		
		while(i1.hasNext())
		{
			Employee e=i1.next();
			
			if(e.sal>30000)
			{
				System.out.println(e);
			}
		}*/
	}
}
