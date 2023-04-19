package com.Test_8;

import java.util.ArrayList;
import java.util.Iterator;

/*WAP to create a ArrayList<Emp> and search for Emp object whose	[2M]
Empno=10 and delete all the records whose dept is same as
empno 10. 
Emp [Empno,ename,Dept d]
Dept [did,dname*/

class Emp
{
    public int Empno;
    public String ename;
    public Dept d;

    public Emp(int Empno, String ename, Dept d) 
    {
        this.Empno = Empno;
        this.ename = ename;
        this.d = d;
    }

    public String toString()
    {
        return +Empno+" "+ename+" "+d;
    }
}

class Dept
{
    public int did;
    public String dname;

    public Dept(int did, String dname) 
    {
        this.did = did;
        this.dname = dname;
    }

    public String toString()
    {
        return +did+" "+dname;
    }
}
public class Q8
{

	public static void main(String[] args)
	{

	            ArrayList<Emp> empList = new ArrayList<>();
		        empList.add(new Emp(10, "John", new Dept(10, "Sales")));
		        empList.add(new Emp(20, "Mary", new Dept(20, "Marketing")));
		        empList.add(new Emp(30, "Bob", new Dept(10, "Sales")));
		        empList.add(new Emp(40, "Alice", new Dept(30, "Engineering")));
		        empList.add(new Emp(50, "David", new Dept(40, "Operations")));

		        Emp empWithEmpno10 = null;
		        for (Emp emp : empList) 
		        {
		            if (emp.Empno == 10)
		            {
		                empWithEmpno10 = emp;
		                break;
		            }
		        }

		        if (empWithEmpno10 == null) 
		        {
		            System.out.println("No Emp object found with Empno=10");
		        }
		        else 
		        {
		        	Iterator<Emp> empIterator = empList.iterator();
		            int numDeleted = 0;
		            while (empIterator.hasNext()) 
		            {
		                Emp emp = empIterator.next();
		                if (emp.d.did == empWithEmpno10.Empno) 
		                {
		                    empIterator.remove();
		                    numDeleted++;
		                }
		            
		            }
		            System.out.println(numDeleted + " Emp objects deleted.");
		        }

		        System.out.println("Updated empList:");
		        for (Emp emp : empList)
		        {
		            System.out.println(emp);
		        }
		    }
		}
