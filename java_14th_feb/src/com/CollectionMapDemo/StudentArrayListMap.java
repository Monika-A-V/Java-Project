package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Student1
{
	int id;
	String name;
	String Cname;
	
	public Student1(int id,String name,String Cname)
	{
		this.id=id;
		this.name=name;
		this.Cname=Cname;
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", Cname=" + Cname + "]";
	}
	
}
public class StudentArrayListMap {

	public static void main(String[] args) 
	{
		ArrayList<Student1> al=new ArrayList<>();
		al.add(new Student1(1,"monika","java"));
		al.add(new Student1(2,"pooja","dotnet"));
		al.add(new Student1(3,"pritee","sql"));
		al.add(new Student1(4,"sanju","dotnet"));
		System.out.println(al);
		
		System.out.println(",,,,,,,,third way,,,,,,,,,");
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
		Iterator<Student1> itr=al.iterator();
		ArrayList<String> list=new ArrayList<>();
		while(itr.hasNext())
		{
			Student1 s1=itr.next();
			if(hm.containsKey(s1.Cname))
			{
				list=hm.get(s1.Cname);
				list.add(s1.name);
				
			}
			else
			{
				list=new ArrayList();
				list.add(s1.name);
			}
			hm.put(s1.Cname,list);
		}
		for(Map.Entry<String,ArrayList<String>> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		/*System.out.println(",,,,,,,second way,,,,,,,,,");
		HashMap<String,ArrayList<Student1>> hm=new HashMap<>();
		Iterator<Student1> itr=al.iterator();
		while(itr.hasNext())
		{
			Student1 s1=itr.next();
			Iterator<Student1> itr2=al.iterator();
			ArrayList<Student1> al1=new ArrayList<>();
			while(itr2.hasNext())
			{
				Student1 s2=itr2.next();
				
				if(s1.Cname.equals(s2.Cname))
				{
					al1.add(s2);
				}
			}
			hm.put(s1.Cname,al1);
		}
		for(Entry<String, ArrayList<Student1>> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		
		
		/*System.out.println(",,,,,,,first way,,,,,,,,");
		 * HashMap<String,ArrayList<String>> hm=new HashMap();
		for(int i=0;i<al.size();i++)
		{
			ArrayList<String> l=new ArrayList();
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i).Cname==al.get(j).Cname)
				{
					l.add(al.get(j).name);
				}
			}
			hm.put(al.get(i).Cname, l);
		}
		for(Entry<String, ArrayList<String>> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
			}

}
