package com.Test_2;
//print the series 0,3,8,15,24,35,48.....n terms
public class Test_6 
{
   public static void main(String[] args)
	{
		
		        int temp = 0;
		        for (int i = 0 ; i < 10 ; i++) 
		        {
		            if (i == 0) 
		            {
		                temp = 0;
		            } else
		            {
		                temp = i * (i + 2);
		            }
		            System.out.print(temp + " ");
		        }
		    }
		}

		
		
	
