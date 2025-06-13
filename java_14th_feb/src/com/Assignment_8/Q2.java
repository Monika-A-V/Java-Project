package com.Assignment_8;

//Employee class with fields (empno, empname, dept) where dept is object of 
//department class with fields (deptId, deptname) Write a program to create 
//array of 3 employees each employee will have different department. 

class Employee
{
    public int empno;
    public String empname;
    public Department dept;

    public Employee(int empno, String empname, Department dept) 
    {
        this.empno = empno;
        this.empname = empname;
        this.dept = dept;
    }
}
class Department 
{
    public int deptId;
    public String deptname;

    public Department(int deptId, String deptname) 
    {
        this.deptId = deptId;
        this.deptname = deptname;
    }
}

public class Q2
{
   public static void main(String[] args) 
	{
		Department dept1 = new Department(1, "IT");
		Department dept2 = new Department(2, "HR");
		Department dept3 = new Department(3, "Marketing");

		Employee e[] = new Employee[3];
		e[0] = new Employee(101, "Monika", dept1);
		e[1] = new Employee(102, "Pooja", dept2);
		e[2] = new Employee(103, "sanju", dept3);

		for (int i = 0; i < e.length; i++) 
		
		{
		    System.out.println("Employee " + (i+1) + ":");
		    System.out.println("Empno: " + e[i].empno);
		    System.out.println("Empname: " + e[i].empname);
		    System.out.println("Department ID: " + e[i].dept.deptId);
		    System.out.println("Department name: " + e[i].dept.deptname);
		    System.out.println();
		}
}

}
