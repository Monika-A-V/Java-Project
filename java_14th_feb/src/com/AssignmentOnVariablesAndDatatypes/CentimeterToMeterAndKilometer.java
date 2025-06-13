package com.AssignmentOnVariablesAndDatatypes;
import java.util.*;

//Java program to convert centimeter into meter and kilometer

public class CentimeterToMeterAndKilometer 
{

	public static void main(String[] args) 
			{
				double cm, meter, kilometer;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter number in centimeter");
				cm=sc.nextDouble();
				
                meter = cm / 100.0;
				kilometer = cm / 100000.0;
			
				System.out.println("Length in meter =  "+meter+ "m");
				
			
				System.out.println("Length in Kilometer = " +kilometer + "km");
			}
		}




