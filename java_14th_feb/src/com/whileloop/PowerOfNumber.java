package com.whileloop;
import java.util.*;

public class PowerOfNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int base=sc.nextInt();
		System.out.println("enter exponent");
		int expo=sc.nextInt();
		
		int i=1;
		int power=1;
		while(i<=expo)
		{
			power=power*base;
			i++;
		}
		System.out.println(power);

	}

}
