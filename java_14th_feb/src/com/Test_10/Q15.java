package com.Test_10;

/*Write a Program in Java to input a 3 digit number and 
 * check whether it is a Fascinating Number or not..
*/
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		    Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a 3-digit number: ");
	        int num = sc.nextInt();
	       
	        int product1 = num * 2;
	        int product2 = num * 3;
	        String concatNum = num + "" + product1 + "" + product2;
	        boolean isFascinating = true;
	        for (int i = 1; i <= 9; i++)
	        {
	            int count = 0;
	            for (int j = 0; j < concatNum.length(); j++)
	            {
	                int digit = Character.getNumericValue(concatNum.charAt(j));
	                if (digit == i)
	                {
	                    count++;
	                }
	            }
	            if (count != 1)
	            {
	                isFascinating = false;
	                break;
	            }
	        }
	        if (isFascinating) 
	        {
	            System.out.println(num + " is a fascinating number.");
	        }
	        else
	        {
	            System.out.println(num + " is not a fascinating number.");
	        }
	    }
	}