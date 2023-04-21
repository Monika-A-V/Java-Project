package com.CollectionArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Student111
{
	int id;
	String name;
	ArrayList<Course> c;
	public Student111(int id, String name,ArrayList<Course> c)
	{
		super();
		this.id = id;
		this.name = name;
		this.c=c;
	}

	public Student111(String name2, ArrayList<Course> c1) 
	{
		this.name=name2;
		this.c=c1;
	}

	@Override
	public String toString()
	{
		return id+" "+name+" "+c;
	}
	}
class Course
{
	int Cid;
	String Cname;
	
	Course(int Cid,String Cname)
	{
		this.Cname=Cname;
		this.Cid=Cid;
	}
	public Course(String cname2) 
	{
		this.Cname=cname2;
	}
	public String toString()
	{
		return Cname+" "+Cid;
	}
}
public class StudentArrayList {

	public static void main(String[] args) 
	{
		HashMap<String,ArrayList<String>> hm=new HashMap();
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Course> c1=new ArrayList();
		for(int i=1;i<=2;i++)
		{
			//System.out.println("enter id");
			//int cid=sc.nextInt();
			System.out.println("enter course name");
			String Cname=sc.next();
			c1.add(new Course(Cname));
			
			ArrayList<String> al=new ArrayList();
			for(int j=1;j<=2;j++)
			{
				//System.out.println("enter student id");
				//int id=sc.nextInt();
				System.out.println("enter student name");
				String name=sc.next();
				
				al.add(name);
			}
			hm.put(Cname, al);
		}
		for(Entry<String, ArrayList<String>> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		}
}
        /*ArrayList<Student111> al=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			
			ArrayList<Course> al1=new ArrayList();
			for(int j=1;j<=2;j++)
			{
				System.out.println("enter course id");
				int cid=sc.nextInt();
				System.out.println("enter course name");
				String cname=sc.next();
				
				al1.add(new Course(cid,cname));
				
			}
			al.add(new Student111(id,name,al1));
		}
			
         for(int i1=0;i1<al.size();i1++)
			{
				System.out.println(al.get(i1));
			}*/
			
		//System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		
		/*Course c=new Course("java");
		Course c1=new Course("php");
		Course c2=new Course("dotnet");
		
		ArrayList<Course> cc=new ArrayList();
		cc.add(c);
		cc.add(c1);
		cc.add(c2);
		Student111 s1=new Student111(1,"monika",cc);
		
		ArrayList<Course> cc1=new ArrayList();
		cc1.add(c);
		cc1.add(c1);
		cc1.add(c2);
		Student111 s2=new Student111(2,"pooja",cc1);


		ArrayList<Course> cc2=new ArrayList();
		cc2.add(c);
		cc2.add(c1);
		cc2.add(c2);
		Student111 s3=new Student111(3,"sanju",cc2);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student111 sss:al)
		{
			System.out.println(sss.id+" = "+sss.name);
			
			//System.out.println("courses");
			
			for(Course c5:sss.c)
			{
				System.out.print("courses are = " +c5.Cname+"\n ");

			}

		}*/
		
