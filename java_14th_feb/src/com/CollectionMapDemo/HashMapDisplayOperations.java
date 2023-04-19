package com.CollectionMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDisplayOperations {

	public static void main(String[] args) {

		HashMap<String,Float> hm=new HashMap<>();
		
		hm.put("monika",67.5f);
		hm.put("pooja",88.8f);
		hm.put("pritee",77.9f);
		System.out.println(hm);
		
		
System.out.println(",,,,,,,,,,first method of iteration,,,,,,,,,,,,");

for(Entry<String,Float> m:hm.entrySet())
{
	System.out.println(m.getKey()+" "+m.getValue());
}

System.out.println(",,,,,,,,,,second method for iteration,,,,,,,,,,");

for(Entry<String,Float>em:hm.entrySet())
{
	System.out.println(em.getKey()+" "+hm.get(em.getKey()));
}

System.out.println(",,,,,,,,,,third method for iteration,,,,,,,,,,,");

Set s=hm.keySet();
System.out.println(s);

Iterator<String>itr=s.iterator();
while(itr.hasNext())
{
	String s1=itr.next();
	System.out.println(s1+" "+hm.get(s1));
}

System.out.println(",,,,,,,,,,Fourth method for iteration,,,,,,,,,,");

Set s2=hm.entrySet();
Iterator<Map.Entry<String,Float>> itr2=s2.iterator();
while(itr2.hasNext())
{
	Map.Entry<String,Float> m=itr2.next();
	System.out.println(m.getKey()+" "+m.getValue());
}
	}

}
