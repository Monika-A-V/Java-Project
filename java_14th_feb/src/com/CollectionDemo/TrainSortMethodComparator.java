package com.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Train
{
	int id;
	String name;
	int seats;
	
	Train(int id,String name,int seats)
	{
		this.id=id;
		this.name=name;
		this.seats=seats;
	}
	public String toString()
	{
		return id+" "+name+" "+seats;
	}
}
public class TrainSortMethodComparator {

	public static void main(String[] args) 
	{
		ArrayList<Train> al=new ArrayList<>();
		al.add(new Train(1,"Shatabdi express",20));
		al.add(new Train(2,"Rajdhani express",30));
		al.add(new Train(4,"Maharaja express",40));
		al.add(new Train(3,"Vande Bharat express",50));
        System.out.println(al);
        
        for(Train t:al)
        {
        	System.out.println(t);
        }
        System.out.println(",,,,id comparator,,,,,");
        Collections.sort(al,new IdComparator1());
        
        for(Train t:al)
        {
        	System.out.println(t);
        }
        System.out.println(",,,,,,name comparator,,,,,,,,");
        Collections.sort(al,new NameComparator1());
        for(Train t:al)
        {
        	System.out.println(t);
        }
        System.out.println(",,,,,,seats comparator,,,,,,,");
        Collections.sort(al,new SeatsComparator());
        {
        	for(Train t:al)
        	{
        		System.out.println(t);
        	}
        }
		
	}

}
class IdComparator1 implements Comparator<Train>
{
	public int compare(Train t1,Train t2)
	{
		return t1.id-t2.id;
	}
}
class NameComparator1 implements Comparator<Train>
{
	public int compare(Train t1,Train t2)
	{
		return t1.name.compareTo(t2.name);
	}
}
class SeatsComparator implements Comparator<Train>
{
	public int compare(Train t1,Train t2)
	{
		return t1.seats-t2.seats;
	}
}