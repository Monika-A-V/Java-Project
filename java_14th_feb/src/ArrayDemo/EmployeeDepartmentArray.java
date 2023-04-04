package ArrayDemo;

import java.util.Scanner;

class Employee11
{
	int id;
	String name;
	int salary;
	
	Employee11(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}
class Department
{
	int id;
	String name;
	Employee11 e;
	
	Department(int id,String name,Employee11 e)
	{
		this.id=id;
		this.name=name;
		this.e=e;
	}

public String toString()
{
	return id+" "+name+" "+e;
}
}
public class EmployeeDepartmentArray
{

	public static void main(String[] args)
	{
		Department d[]=new Department[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<d.length;i++)
		{
			System.out.println("enter dept id");
			int id=sc.nextInt();
			System.out.println("enter dept name");
			String name=sc.next();
			
			System.out.println("enter data for employee");
			
			System.out.println("enter employee id");
			int id1=sc.nextInt();
			System.out.println("enter employee name");
			String name1=sc.next();
			System.out.println("enter employee salary");
			int salary1=sc.nextInt();
			
			
			//Employee11 e=new Employee11(id1,name1,salary1);
			//d[i]=new Department(id,name,e);
			
			d[i]=new Department(id,name,new Employee11(id1,name1,salary1));
			
		}
		System.out.println("////////////");
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		System.out.println("///////////");
		for(Department dept:d)
		{
			System.out.println(dept);
		}
		}

}
