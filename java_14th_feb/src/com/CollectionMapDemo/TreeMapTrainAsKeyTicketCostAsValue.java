package com.CollectionMapDemo;
import java.util.*;

class Train implements Comparable<Train>
{
	int tid;
	String tname;
	int tSeats;
	String tsname;
	
	public Train(int tid, String tname, int tSeats, String tsname)
	{
		super();
		this.tid = tid;
		this.tname = tname;
		this.tSeats = tSeats;
		this.tsname = tsname;
	}

	@Override
	public String toString() {
		return "Train [tid=" + tid + ", tname=" + tname + ", tSeats=" 
	                   + tSeats + ", tsname=" + tsname + "]";
	}

	@Override
	public int compareTo(Train o)
	{
		if(this.tSeats==o.tSeats)
		{
			if(this.tsname.equals(o.tsname))
			{
				return o.tid-this.tid;
			}
			else
			{
				return this.tsname.compareTo(o.tsname);
			}
			}
		else
			{
				return this.tSeats-o.tSeats;
			}
		}
		/*if(this.tSeats>o.tSeats)
		{
			return 1;
		}
		else if(this.tSeats<o.tSeats)
		{
			return -1;
		}
		else
		{
			if(this.tsname.compareTo(o.tsname)==0)
			{
				return this.tid-o.tid;
				
			}
			else
			{
				return this.tsname.compareTo(o.tsname);
			}
		}*/
		/*return this.tid-o.tid;
		return this.tsname.compareTo(o.tsname);
		return this.tSeats-o.tSeats;
		return 0;*/
	}
	
public class TreeMapTrainAsKeyTicketCostAsValue {

	public static void main(String[] args)
	{

		TreeMap<Train,Integer> tm=new TreeMap<>();
		tm.put(new Train(1,"rrr",30,"cc"),10000);
		tm.put(new Train(2,"qqq",30,"bb"),20000);
		tm.put(new Train(3,"ppp",50,"rr"),30000);
		tm.put(new Train(4,"mmm",60,"dd"),40000);

		//System.out.println(tm);
		
		for(Map.Entry<Train,Integer> m:tm.entrySet())
		{
			System.out.println(m.getKey()+" --> " + m.getValue());
		}
	}

}
