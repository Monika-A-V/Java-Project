package com.CollectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> v=new Vector<>();
		v.add("pune");
		v.add("mumbai");
		
		//System.out.println(v.get(0));
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			v.remove("pune");
		}
		System.out.println(v);
	}

}
