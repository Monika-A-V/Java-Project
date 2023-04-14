package com.CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("dotnet");
		al.add("php");
		al.add("angular");
		al.add("sql");
	    System.out.println(al);
	    
	    Iterator<String>itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	String s=itr.next();
	    	if(s.equals("python"))
	    	{
	    		itr.remove();//fail safe
	    	}
	    }
	    System.out.println(al);
	    //System.out.println(itr.next());
    	//al.remove("python");//fail fast
	}

}
