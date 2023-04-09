package com.Test_1;
/*
1 2 3 4 5 
  1 2 3 4 
    1 2 3 
      1 2 
        1 
*/

public class NumberPattern_8 
{

	public static void main(String[] args) 
	{
	

		        int n = 5;
		        for (int i = 0; i < n; i++)
		        {
		            for (int j = 0; j < i; j++) 
		            {
		                System.out.print("  ");
		            }
		            for (int k = i + 1; k <= n; k++) 
		            {
		                System.out.print(k - i + " ");
		            }
		            System.out.println();
		        }
		    }
		}

