package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSort {

	public static void main(String[] args) {

/*HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1,"red");
		hm.put(4,"black");
		hm.put(2,"yellow");
		System.out.println(hm);
		
		Collection<String> c=hm.values();
		System.out.println(c);
		
		ArrayList<String> l=new ArrayList<>(c);
		
		Collections.sort(l);
		Collections.reverse(l);
		System.out.println(l);
		
		System.out.println(",,,,,,,,,,,");
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			for (Map.Entry<Integer, String> m1 : hm.entrySet()) 
			{
                if (m1.getValue().equals(s))
                {
                    System.out.println(m1.getKey() + " " + m1.getValue());
                   
                }
	}
		}
		    System.out.println(",,,,,,,,,,,,,,,,,,,");
			LinkedHashMap<Integer,String> lh=new LinkedHashMap<>(hm);
			System.out.println(lh);
}}*/

				HashMap<Integer,String> hs1=new HashMap<Integer,String>();
			    
				LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>();
				ArrayList<String> al=new ArrayList<String>();
				hs1.put(105, "sonal");
			    hs1.put(102, "kinjal");
				hs1.put(103,"preeti" );
				
				//1 st step we have to find out values and put in arraylist
				
				Collection<String> col=hs1.values();
				
				Iterator<String> it=col.iterator();
				
				while(it.hasNext())
				{
					
					al.add (it.next());
				}
				Collections.sort(al);
				Collections.reverse(al);
				System.out.println(al);
				
				//2nd Iterate the arraylist and put it in another map
				
				Iterator<String> it1=al.iterator();
				while(it1.hasNext())
				{
					String s=it1.next();
					
					Set<Map.Entry<Integer,String>> set=hs1.entrySet();
					for(Map.Entry<Integer, String> map:set)
					{
						
						String st=map.getValue();
						if(s.equals(st))
								{
							
							Integer i=map.getKey();
							
							lh.put(i, st);
							}
					}
				}
				
			    System.out.println(lh);

			}
}