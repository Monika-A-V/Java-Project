package com.Test_1;
import java.util.*;

public class TwinPrime_10
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		int c1=0,c2=0;
		
		for(int i=1;i<=num1;i++)
		{
		
			if(num1%i==0)
			{
				c1++;
			}
		}
		for(int j=1;j<=num2;j++)
		{
			if(num2%j==0)
			{
				c2++;
			}
		}
      int diff=num1-num2;
      
      if(c1==2 && c2==2 && (diff==2 || diff==-2))
      {
    	  System.out.println("number is twin prime");
      }
    	  else
    	  {
    		  System.out.println("not twin prime");
    	  }
      }
	}


