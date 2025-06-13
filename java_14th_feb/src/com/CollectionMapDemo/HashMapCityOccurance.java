package com.CollectionMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapCityOccurance {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList();
		
		al.add("pune");
		al.add("pune");
		al.add("mumbai");
		al.add("goa");
		al.add("mumbai");
		
		HashMap<String ,Integer> hm=new HashMap();
		
		for(int i=0;i<al.size();i++)
		{
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equalsIgnoreCase(al.get(j)))
				{
					count++;
					al.remove(j);
					j--;
				}
			}
			//System.out.println(al.get(i)+" "+count);
			hm.put(al.get(i),count);
		}
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		
		/*ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);*/
	}

}
