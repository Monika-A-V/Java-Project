package ArrayDemo;

class Employee12 
{
    int id;
    String name;
    double salary;

    public Employee12(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString()
    {
    	return id+" "+name+" "+salary;
    }
}

public class EmployeeSalary 
{

	public static void main(String[] args) 
	{
		Employee12[] emp = new Employee12[4];
		emp[0]=new Employee12(1,"monika",20000);
		emp[1]=new Employee12(2,"pooja",30000);
		emp[2]=new Employee12(3,"sanju",40000);
		emp[3]=new Employee12(4,"shital",20000);
	

	        for (Employee12 e : emp) 
	        {
	            if (e.salary > 20000)
	            {
	                e.salary *= 1.1;
	                System.out.println(e);
	            }
	        }
	    }
}
