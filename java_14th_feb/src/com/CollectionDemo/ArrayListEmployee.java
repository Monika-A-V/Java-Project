package com.CollectionDemo;

import java.util.ArrayList;

class Employee2 {
    public int id;
    public String name;
    public double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString()
    {
    	return +id+" "+name+" "+salary;
    }
}
public class ArrayListEmployee {

	public static void main(String[] args)
	{
		ArrayList<Employee2> employeeList = new ArrayList<>();
        employeeList.add(new Employee2(1, "pooja", 25000));
        employeeList.add(new Employee2(2, "mona", 30000));
        employeeList.add(new Employee2(3, "pritee", 28000));

        for (Employee2 employee : employeeList) 
        {
            if (employee.salary < 30000) {
                double newSalary = employee.salary * 1.1;
                employee.salary = newSalary;
            }
        }

        for (Employee2 employee : employeeList) 
        {
            System.out.println("Name: " + employee.name + ", Salary: " + employee.salary);
        }
    }

		}
