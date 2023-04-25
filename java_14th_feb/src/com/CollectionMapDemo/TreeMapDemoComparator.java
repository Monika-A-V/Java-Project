package com.CollectionMapDemo;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class MyCom implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		return o2-o1;
	}
}
public class TreeMapDemoComparator {

	public static void main(String[] args) {

		TreeMap<Integer,String> tm=new TreeMap<>(new MyCom());
		
		tm.put(55,"green");
		tm.put(63,"pink");
		tm.put(33,"black");
		tm.put(22,"yellow");
		tm.put(69,"red");
		tm.put(68,"red");

		System.out.println(tm);
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,");
		for(Map.Entry<Integer,String> m:tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		NavigableMap m=tm.descendingMap();
		System.out.println(m);
		
		System.out.println(tm.ceilingEntry(56));
		System.out.println(tm.ceilingKey(70));
		System.out.println(tm.floorEntry(60));
		System.out.println(tm.floorEntry(50));
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(tm.subMap(63,68));
		System.out.println(tm.subMap(63, false,69,true));
		System.out.println(tm.firstEntry());
		
		System.out.println(tm.higherEntry(22));
		System.out.println(tm.headMap(69));
		System.out.println(tm.tailMap(68));
		
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(tm);
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm);
	}

}

