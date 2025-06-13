package com.Test_3;
    
//Write getter setter methods for class  variable
/*class Employee
{ private int id;
  private String name="HI";
private Boolean ismanager;
private float salary;
Department dept;
//ADD getter setter for Employee
}*/

public class Employee_10
{
	private int id;
    private String name = "HI";
    private Boolean ismanager;
    private float salary;
    private Department_10 dept;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public Boolean getIsmanager()
    {
        return ismanager;
    }

    public void setIsmanager(Boolean ismanager)
    {
        this.ismanager = ismanager;
    }

    public float getSalary()
    {
        return salary;
    }

    public void setSalary(float salary) 
    {
        this.salary = salary;
    }

    public Department_10 getDept() 
    {
        return dept;
    }

    public void setDept(Department_10 dept)
    {
        this.dept = dept;
    }

	public static void main(String[] args) 
	{
	
		    Employee_10 e = new Employee_10();

		    e.setId(1);
		    e.setName("John");
		    e.setIsmanager(false);
		    e.setSalary(50000.0f);

		    Department_10 dept = new Department_10();
		    dept.setName("Sales");
		    e.setDept(dept);

		    System.out.println("ID: " + e.getId());
		    System.out.println("Name: " + e.getName());
		    System.out.println("Is Manager? " + e.getIsmanager());
		    System.out.println("Salary: " + e.getSalary());
		    System.out.println("Department: " +e.getDept().getName());
	}
}
