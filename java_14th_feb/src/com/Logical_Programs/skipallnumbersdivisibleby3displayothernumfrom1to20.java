package com.Logical_Programs;

public class skipallnumbersdivisibleby3displayothernumfrom1to20 
{

	public static void main(String[] args) 
	{
		int i = 1;
		while (i <= 20) {
		    if (i % 3 != 0) {
		        System.out.println(i);
		    }
		    i++;
		}


	}

}
