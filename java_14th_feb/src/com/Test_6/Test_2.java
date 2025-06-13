package com.Test_6;

//WAP to create class Programmer with Method workingHours().
//create class Employee which extends Programmer implement workingHours()differently in child.

class Programmer 
{
	   public void workingHours()
	   {
	      System.out.println("A programmer typically works 8 hours a day.");
	   }
	}

class Employee extends Programmer
{
	   public void workingHours() 
	   {
	      System.out.println("An employee typically works 9 hours a day.");
	   }
	}
public class Test_2 
{

	public static void main(String[] args) 
	{

		 Programmer p = new Programmer();
	      p.workingHours();
	      
	      Employee e = new Employee();
	      e.workingHours();
	   }
	}
