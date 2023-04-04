package com.Logical_Programs;
import java.util.*;

public class PrimeNumBet1to100
{

	public static void main(String[] args) 
	{
       int num=100;
       for(int i=1;i<100;i++)
       {
    	   boolean flag=true;
    	   for(int j=2;j<i;j++)
    	   {
    		   if(i%j==0)
    		   {
    			   flag=false;
    			   break;
    		   }
    	   }
    	   if(flag==true)
    	   {
    		   System.out.println(i+" ");
    	   }
       }
		
	}

}
