package com.ClassAndObject;

class department
{
	int id;
	String name;
	
	department(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	/*void deptShow()
	{
		System.out.println(id+" "+name);
	}*/
	public String toString()
	{
		return id+" "+name;
	}
}

public class ContainmentEmployee
{
	int id;
	String name;
	int salary;
	department dept;
	
	ContainmentEmployee(int id,String name,int salary,department dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	/*void displayEmployee()
	{
		System.out.println(id+" "+name+" "+salary);
		dept.deptShow();
	}*/
	public String toString()
	{
		return id+" "+name+" "+salary+" "+dept;
	}

	public static void main(String[] args)
	{
		//department d=new department(1,"mona");
		//ContainmentEmployee e=new ContainmentEmployee(1,"rohi",20000,d);

		//e.displayEmployee();
		
		ContainmentEmployee e=new ContainmentEmployee(1,"rohi",20000,new department(1,"hr"));
		System.out.println(e);
	}

}
