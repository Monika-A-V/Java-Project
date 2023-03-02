package com.AlphabetPattern;
import java.util.*;

/*
ABCD
A  D
A  D
ABCD
 */

public class AlphabetPattern1 
{

	public static void main(String[] args) 
	{
		
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<='D';j++)
			{
		if(i=='A'||j=='D'||j=='A'||i=='D' )
		{
			System.out.print(j);
		}
		else {
			System.out.print(" ");
		}
		}
           System.out.println();
	}

}}
