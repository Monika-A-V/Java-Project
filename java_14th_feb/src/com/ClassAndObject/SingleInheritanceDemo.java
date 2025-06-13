package com.ClassAndObject;

class Employee1
{
    void salary()
    {
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Employee1 
{ 
    void bonus() 
    {
        System.out.println("Bonus=50000");
    }
}
public class SingleInheritanceDemo 
{

	public static void main(String[] args)
	{
		    Programmer p = new Programmer();
	        p.salary();
	        p.bonus(); 

	}

}
