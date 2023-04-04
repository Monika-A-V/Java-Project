package com.Test_3;

/*
      1 
    1 2 3 
  1 2 3 4 5 
1 2 3 4 5 6 7 

 */
public class Test_7 
{
		   public static void main(String[] args)
		   {
		      
		      for(int i = 1; i <= 4; i++)
		      {
		        
		         for(int j = 1; j <= 4-i; j++)
		         {
		            System.out.print("  "); 
		         }
		         for(int k = 1; k <= 2*i-1; k++) 
		         {
		            System.out.print(k + " ");
		         }
		         System.out.println();
		      }
		   }
		}

