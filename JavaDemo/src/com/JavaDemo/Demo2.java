package com.JavaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo2  {

	public static void main(String[] args) 
	{
		ArrayList<Book> al=new ArrayList<Book>();
		
		al.add(new Book(1,"AB",200,new author(11,"ram")));
		al.add(new Book(2,"CD",300,new author(22,"sham")));
		al.add(new Book(1,"EF",400,new author(33,"sonal")));
		al.add(new Book(4,"GH",600,new author(44,"ram")));
		al.add(new Book(5,"IJ",500,new author(55,"kiya")));
		System.out.println(al);
		
		
		
		/*HashMap<String,Integer> hm=new HashMap<>();
		
		Iterator<Book> itr=al.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			Iterator<Book> itr2=al.iterator();
	         ArrayList<Book> al1=new ArrayList<>();
			while(itr2.hasNext())
			{
				Book b1=itr.next();
				
				if(b.name.equals(b1.name))
				{
					al.add(b1);
				}
			}
			hm.put(al.name,al1);
					
		}
		
		for(Map.Entry<String,Integer> fm:hm.entrySet())
		{
			System.out.println(fm.getKey()+" "+fm.getValue());
		}*/
		
		System.out.println("id comparator");
		Collections.sort(al,new anameComparator());
		
		for(Book b3:al)
		{
			System.out.println(b3);
		}
		
}

}

class anameComparator implements Comparator<Book>
{
	public int compare(Book b,Book b1)
	{
		if(b.a.aname.equals(b1.a.aname))
		{
			
		    return b.price-b1.price;
		
	}
		else
		{
			return 0;
		}
}
}
class Book
{
	int id;
	String name;
    int price;
    author a;
    
    
	public Book(int id, String name, int price, author a) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.a = a;
	}


	@Override
	public String toString()
	{
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", a=" + a + "]";
	}
	
    }

class author
{
	int aid;
	String aname;
	
	public author(int aid, String aname) 
	{
		super();
		this.aid = aid;
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "author [aid=" + aid + ", aname=" + aname + "]";
	}}