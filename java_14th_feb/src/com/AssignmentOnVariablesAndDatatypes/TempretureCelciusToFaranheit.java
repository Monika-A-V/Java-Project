package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;

// Convert Celsius into Fahrenheit in Java Program


public class TempretureCelciusToFaranheit
{

	public static void main(String[] args)
	{
		    	Scanner in = new Scanner(System.in);

		        System.out.println("Enter the temperature in Celsius::\n");
		        float c = in.nextFloat();
		        
		        
		        float f = (float)((c * 9 / 5) + 32);

		        System.out.println(c + " Celsius = " + f + " Fahrenheit");
	}
	
	
}

/*faranheit to celcius
 System.out.println("Enter the temperature in Fahrenheit::\n");

float f = in.nextFloat();
float c;
// c = celsius
// f = fahrenheit


c = (float)((f - 32) * 5 / 9);

// Output
System.out.print("\n");
System.out.println(f + " Fahrenheit = " + c + " Celsius");*/

