package com.Logical_Programs;
import java.util.*;

public class GuessingNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int magicnumber=56;
		
		while(true)
		{
			System.out.println("enter guessing number");
			int n=sc.nextInt();
			
			if(n>magicnumber)
			{
				System.out.println("number is greater pls try again");
			}
			else if(n<magicnumber)
			{
				System.out.println("number is less pls try again");
			}
			else
			{
				System.out.println("guessing number is correct");
				break;
			}
		}

	}

}
