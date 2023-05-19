package com.FileHandling.DesignPattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {

		 Scanner sc= new Scanner(System.in);
	     
	     System.out.println("Enter the electrcity plan(domestic,commercial,ngo):");
	     
	     String planName= sc.next();
	     
	     System.out.println("Enter number of units consumed:");

	     float units= sc.nextFloat();
	     
	     GetPlanFactory plan= new GetPlanFactory();
	     
	     ElectricityPlan ep= plan.getPlan(planName);
	     
	     if(ep==null)
	     {
	    	 System.out.println("No such plan exists..........");
	     }
	     else
	     {
	    	 ep.getRate();
	    	 ep.calculateBill(units);
	     }
	     
	     sc.close();

		}
}