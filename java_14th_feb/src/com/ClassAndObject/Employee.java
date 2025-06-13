package com.ClassAndObject;

public class Employee 
{

	int id;
	String name;
	double salary;
	
	
	public static void main(String[] args)
	{
		

		Employee emp1=new Employee();
		
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		
		emp1.id=101;
		emp1.name="monika";
		emp1.salary=20000;
		
		System.out.println(emp1.id+" "+emp1.name+" "+emp1.salary);
		
		Employee emp2=new Employee();
		
		emp2.id=102;
		emp2.name="sanju";
		emp2.salary=30000;
		
		System.out.println(emp2.id+" "+emp2.name+" "+emp2.salary);
		
		
	}

}
