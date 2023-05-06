package com.Test_10;

/*Employee class is as follows . Employee {
int empno ; String name ;

Department dept ;}
Where dept is object of department class. Department class as deptId and deptname.
Write a program to create array of 3 employees. Each employee will have different department. 
*/

class Employee 
{
    int empno;
    String name;
    Department dept;
    
    public Employee(int empno, String name, Department dept)
    {
        this.empno = empno;
        this.name = name;
        this.dept = dept;
    }
}

class Department 
{
    int deptId;
    String deptName;
    
    public Department(int deptId, String deptName)
    {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}
public class Q13 {

	public static void main(String[] args) 
	{

		   Department dept1 = new Department(1, "Sales");
	        Department dept2 = new Department(2, "Marketing");
	        Department dept3 = new Department(3, "Engineering");
	        
	        Employee[] employees = new Employee[3];
	        
	        employees[0] = new Employee(101, "POOJA", dept1);
	        employees[1] = new Employee(102, "MONIKA", dept2);
	        employees[2] = new Employee(103, "PREETI", dept3);
	        
	        for (Employee emp : employees)
	        {
	            System.out.println(emp.name + " works in the " + emp.dept.deptName + " department.");
	        }
	    }
	}