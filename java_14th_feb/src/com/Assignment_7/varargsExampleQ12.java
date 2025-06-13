package com.Assignment_7;

//What is use of variable arguments show with example?

public class varargsExampleQ12 
{
	 public static void Numbers(int... numbers) 
	 {
	      System.out.println("Printing numbers:");
	      for (int num : numbers)
	      {
	         System.out.println(num);
	      }
	   }

	public static void main(String[] args)
	{
	              Numbers(1,2);
			      Numbers(1, 2, 3,4);
			      Numbers(10, 20, 30, 40, 50);
			      Numbers(10, 20, 30, 40, 50,60);

			   }
            }
