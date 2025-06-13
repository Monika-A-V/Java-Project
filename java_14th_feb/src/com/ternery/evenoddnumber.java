package com.ternery;
import java.util.*;

public class evenoddnumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		String evenodd=(n%2==0)?"even":"odd";
		System.out.println(n + " is " + evenodd);

		
	}

}
