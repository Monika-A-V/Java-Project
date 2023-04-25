package com.CollectionMapDemo;

import java.util.HashMap;
import java.util.Map;

class StudInfo
{
	int sid;
	String sname;
	
	public StudInfo(int sid, String sname)
	{
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString()
	{
		return "StudInfo [sid=" + sid + ", sname=" + sname + "]";
	}
	
	public int hashCode()
	{
		return sid;
	}
	public boolean equals(Object o)
	{
		StudInfo s=(StudInfo) o;
		if(s.sid==this.sid && s.sname.equals(this.sname))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	}
public class HashMapStudentAsKeyMarksAsValue 
{

	public static void main(String[] args) 
	{
		HashMap<StudInfo,Integer> hm=new HashMap<>();
		
		hm.put(new StudInfo(1,"neha"),89);
		hm.put(new StudInfo(2,"pooja"),90);
		hm.put(new StudInfo(3,"ritu"),85);
		hm.put(new StudInfo(1,"neha"),89);

		for(Map.Entry<StudInfo,Integer> m:hm.entrySet())
		{
			System.out.println(m.getKey()+" --> " + m.getValue());
		}

	}

}
