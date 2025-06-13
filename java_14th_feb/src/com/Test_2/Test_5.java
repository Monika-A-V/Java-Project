package com.Test_2;

/*  
    1
   10
  101
 1010
10101 

*/

public class Test_5
{

	public static void main(String[] args)
	{
		        
		        for (int i = 1; i <= 5; i++) 
		        {
		            for (int j = 1; j <= 5-i; j++) 
		            {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= i; j++) 
		            {
		                if (j % 2 == 0) 
		                {
		                    System.out.print("0");
		                } 
		                else 
		                {
		    
		                    System.out.print("1");
		                }
		            }
		            System.out.println();
		}


	}

}
