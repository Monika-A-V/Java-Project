package com.Assignment_2;
import java.util.Scanner;

//Write a Java program to input basic salary of an employee and calculate its 
//Gross salary according to following -
//Basic Salary <= 10000: HRA = 20%, DA = 80% 
//Basic Salary <= 20000: HRA = 25%, DA = 90% 
//Basic Salary >20000: HRA = 30%, DA = 95%

public class GrossSalaryOfEmployee {

	public static void main(String[] args)
	{

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter basic salary: ");
	        double basicSalary = sc.nextDouble();
	        double grossSalary, hra, da;

	        if (basicSalary <= 10000)
	        {
	            hra = basicSalary * 0.2;
	            da = basicSalary * 0.8;
	        } 
	        else if (basicSalary <= 20000) 
	        {
	            hra = basicSalary * 0.25;
	            da = basicSalary * 0.9;
	        } 
	        else
	        {
	            hra = basicSalary * 0.3;
	            da = basicSalary * 0.95;
	        }

	        grossSalary = basicSalary + hra + da;

	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA: " + hra);
	        System.out.println("DA: " + da);
	        System.out.println("Gross Salary: " + grossSalary);

	}

}
