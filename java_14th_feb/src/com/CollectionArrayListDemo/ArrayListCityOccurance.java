package com.CollectionArrayListDemo;

import java.util.ArrayList;

public class ArrayListCityOccurance {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("pune");
		al.add("mumbai");
		al.add("nagpur");
		al.add("pune");
		al.add("mumbai");
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			
			int count=1;
			boolean isVisited=false;
			for(int j=i-1;j>=0;j--)
			{
			if(al.get(i).equals(al.get(j)))
			{
				isVisited=true;
				break;
			}
			}
			if(isVisited==false)
			{
				for(int k=i+1;k<al.size();k++)
				{
					if(al.get(i).equals(al.get(k)))
					{
						count++;
						
					}
				}
				System.out.println(al.get(i)+" "+count);

			}
	}}

}
