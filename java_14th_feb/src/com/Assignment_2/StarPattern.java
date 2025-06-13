package com.Assignment_2;

/*
 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */

public class StarPattern {

	public static void main(String[] args)
	{
                int rows = 5;

		        for (int i = 5; i >= 1; i--)
		        {
		            for (int j = 1; j <= 5- i; j++) 
		            {
		                System.out.print(" ");
		            }

		            for (int k = 1; k <= i; k++) 
		            {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		    }
		}


