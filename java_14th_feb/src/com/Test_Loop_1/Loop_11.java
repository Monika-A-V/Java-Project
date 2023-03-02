package com.Test_Loop_1;

public class Loop_11 {

	public static void main(String[] args)
	{
	
			      int n = 10; // Number of terms to print
			      int prev = 2; // First term
			      int current = 0; // Second term
			      System.out.print(prev + " ");

			      for (int i = 2; i <= n; i++) 
			      {
			         current = prev + (i * i);
			         System.out.print(current + " ");
			         prev = current;
			      }
			   }

}
