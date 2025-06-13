package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;

public class SquarerootOfNumber 
{

	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");   
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();
		
		double temp;
		double sr=n/2;
		do
		{
			temp=sr;
			sr=(temp+(n/temp))/2;
			
			}
		while((temp-sr)!=0);
		{
			System.out.println("squareroot of number is "+sr);
		}
	}}