package com.Test_9;

import java.util.ArrayList;

/*Write a Program in Java, You have an Employee class
Class Employee { 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an array of 5 Emp 
and print all Employee along with their Manager name*/

class Employee
{
    public String name;
    public int eid;
    public int mgrid;

    public Employee(String name, int eid, int mgrid)
    {
        this.name = name;
        this.eid = eid;
        this.mgrid = mgrid;
    }
}
public class Q14
{
   public static void main(String[] args) 
	{
		
		    ArrayList<Employee> employees = new ArrayList<>();

	        employees.add(new Employee("mona", 1, 2));
	        employees.add(new Employee("pooja", 2, 3));
	        employees.add(new Employee("pritee", 3, 4));
	        employees.add(new Employee("Anvi", 4, 5));
	        employees.add(new Employee("kasturi", 5, 1));

	        for (Employee emp : employees)
	        {
	            String mgrName = "";
	            for (Employee mgr : employees)
	            {
	                if (emp.mgrid == mgr.eid) 
	                {
	                    mgrName = mgr.name;
	                    break;
	                }
	            }
	            System.out.println("Employee Name: " + emp.name + ", Employee ID: " + emp.eid + ", Manager Name: " + mgrName);
	        }
	    }
}