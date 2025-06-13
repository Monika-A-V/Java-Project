package com.Logical_Programs;
import java.util.Scanner;

public class TrimorphicNumber 
{
      public static void main(String[] args) 
			    	{
		    		
		    		        Scanner input = new Scanner(System.in);
		    		        System.out.print("Enter a number to check if it's trimorphic: ");
		    		        int num = input.nextInt();
		    		        int cube = num * num * num;
		    		        int temp = num;
		    		        boolean isTrimorphic = true;
		    		        
		    		        while (temp != 0) 
		    		        {
		    		            if (temp % 10 != cube % 10)
		    		            {
		    		                isTrimorphic = false;
		    		                break;
		    		            }
		    		            temp /= 10;
		    		            cube /= 10;
		    		        }
		    		        if (isTrimorphic) 
		    		        {
		    		            System.out.println(num + " is a trimorphic number.");
		    		        } else 
		    		        {
		    		            System.out.println(num + " is not a trimorphic number.");
		    		        }
		    		    }}

