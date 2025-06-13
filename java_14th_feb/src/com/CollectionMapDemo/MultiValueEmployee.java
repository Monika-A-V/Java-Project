package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	}
public class MultiValueEmployee
{

	public static void main(String[] args)
	{
		HashMap<Integer,ArrayList<Employee>> hm=new HashMap();
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			System.out.println("enter salary as key");
			int sal=sc.nextInt();
			
			ArrayList<Employee> al=new ArrayList();
			System.out.println("enter number of employee");
			int n=sc.nextInt();
			for(int j=1;j<=n;j++)
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String name=sc.next();
				al.add(new Employee(id,name));
			}
			hm.put(sal, al);
		}
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		//System.out.println(hm);
		
		for(Map.Entry<Integer,ArrayList<Employee>> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
