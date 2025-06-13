package com.Assignment_1;

public class SwapNumWithAndWithoutThirdVariable {

	public static void main(String[] args)
	{
			      int num1 = 10, num2 = 20, temp;
			      System.out.println("Before swapping:");
			      System.out.println("Value of num1 is " + num1);
			      System.out.println("Value of num2 is " +num2);
			      temp = num1;
			      num1 = num2;
			      num2 = temp;
			      System.out.println("After swapping:");
			      System.out.println("Value of num1 is " + num1);
			      System.out.println("Value of num2 is " +num2);
			      
			      
			      
			      int num3 = 40, num4 = 50;
			      System.out.println("Before swapping:");
			      System.out.println("Value of num1 is " + num3);
			      System.out.println("Value of num2 is " +num4);
			      num3 = num3 + num4;
			      num4 = num3 - num4;
			      num3 = num3 - num4;
			      System.out.println("After swapping:");
			      System.out.println("Value of num1 is " + num3);
			      System.out.println("Value of num2 is " +num4);
			   }
			}

	
