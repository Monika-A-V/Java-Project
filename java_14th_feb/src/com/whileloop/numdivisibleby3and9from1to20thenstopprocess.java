package com.whileloop;

public class numdivisibleby3and9from1to20thenstopprocess 
{

	public static void main(String[] args) 
	{
		int i = 1;
		while (i <= 20) {
		  if (i % 3 == 0 && i % 9 == 0) {
		    break;
		  }
		  System.out.println(i);
		  i++;
		}


	}

}
