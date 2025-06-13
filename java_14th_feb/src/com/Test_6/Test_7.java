package com.Test_6;

/*Employee class is as follows .
Employee {
int empno ;
String name ;

Department dept ;}
Where dept is object of department class. Department class
as deptId and deptname.
Write a program to create array of 3 employees. Each
employee will have different department.*/


class Employee1 {
    int empno;
    String name;
    Department dept;

    public Employee1(int empno, String name, Department dept) {
        this.empno = empno;
        this.name = name;
        this.dept = dept;
    }}
class Department {
    int deptId;
    String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}
public class Test_7 
{
   public static void main(String[] args) {
	   Department dept1 = new Department(1, "Department A");
       Department dept2 = new Department(2, "Department B");
       Department dept3 = new Department(3, "Department C");

       Employee1  e[] = new Employee1[3];
       e[0] = new Employee1(101, "John", dept1);
       e[1] = new Employee1(102, "Mary", dept2);
       e[2] = new Employee1(103, "Bob", dept3);
       
       for (Employee1 emp : e) {
           System.out.println("Employee Number: " + emp.empno);
           System.out.println("Name: " + emp.name);
           System.out.println("Department ID: " + emp.dept.deptId);
           System.out.println("Department Name: " + emp.dept.deptName);
           System.out.println();
       }
   }
   }

