package com.ArrayDemo;

class Employee 
{
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary() 
    {
        return salary;
    }
}

public class ArrayOfEmployee 
{

	public static void main(String[] args) 
	{
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "Monika", 60000);
        employees[1] = new Employee(2, "Pooja", 10000);
        employees[2] = new Employee(3, "Sanju", 66000);
        
        
        for (int i = 0; i < employees.length; i++) 
        {
            System.out.println("Employee " + (i+1) + " - ID: " + employees[i].getId() 
            + ", Name: " + employees[i].getName() + ", Salary: " + employees[i].getSalary());
        }
        
        
        System.out.println("\nUsing for-each loop:");
        for (Employee emp : employees) 
        {
         System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: " + emp.getSalary());
        }
        
       
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < employees.length) 
        {
         System.out.println("ID: " + employees[i].getId() + ", Name: " + employees[i].getName() + ","
         + " Salary: " + employees[i].getSalary());
            i++;
        }
        
        System.out.println("\nEmployees with salary greater than 20k:");
        for (Employee employee : employees) 
        {
            if (employee.getSalary() > 20000)
            {
                System.out.println(employee.getName() + " - " + employee.getSalary());
            }
    }
}}