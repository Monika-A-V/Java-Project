package CRUD_OPERATION;
import java.util.Scanner;

class Employee 
{
    int id;
    String name;
    String department;
    static Employee e[]=new Employee[10];
    static int employeeCount=0;

 
    public Employee(int id, String name, String department) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
       
       }
    public static void createEmployee(int id, String name, String department) 
    {
    	Employee emp = new Employee(id, name, department);
        e[employeeCount] = emp;
        employeeCount++;
    }
    public static Employee readEmployee(int id) 
    {
        for (int i = 0; i < employeeCount; i++)
        {
            if (e[i].id == id) 
            {
                return e[i];
            }
        }
        return null;
    }
    public static void updateEmployee(int id, String name, String department)
    {
        for (int i = 0; i < employeeCount; i++) 
        {
            if (e[i].id == id) 
            {
                e[i].name = name;
                e[i].department = department;
            }
        }
    }
    public static void deleteEmployee(int id) 
    {
        for (int i = 0; i < employeeCount; i++) 
        {
            if (e[i].id == id) 
            {
                for (int j = i; j < employeeCount - 1; j++)
                {
                    e[j] = e[j + 1];
                }
                e[employeeCount - 1] = null;
                employeeCount--;
                System.out.println("Employee deleted successfully");
                return;
            }
        }
        System.out.println("Employee not found");
    }
     }
public class EMPLOYEE_CRUD_ARRAY {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Create employee");
	            System.out.println("2. Read employee");
	            System.out.println("3. Update employee");
	            System.out.println("4. Delete employee");
	            System.out.println("5. exit");

	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice)
	            {
	                case 1:
	                    System.out.print("Enter employee id: ");
	                    int id = sc.nextInt();
	                    System.out.print("Enter employee name: ");
	                    String name = sc.next();
	                    System.out.print("Enter employee department: ");
	                    String department = sc.next();
	                    Employee.createEmployee(id, name, department);
	                    System.out.println("Employee created successfully");
	                    break;
	                case 2:
	                    System.out.print("Enter employee id: ");
	                    id = sc.nextInt();
	                    Employee employee = Employee.readEmployee(id);
	                    if (employee != null) 
	                    {
	                        System.out.println("Employee details:");
	                        System.out.println("ID: " + employee.id);
	                        System.out.println("Name: " + employee.name);
	                        System.out.println("Department: " + employee.department);
	                    } 
	                    else 
	                    {
	                        System.out.println("Employee not found");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter employee id: ");
	                    id = sc.nextInt();
	                    System.out.print("Enter employee name: ");
	                    name = sc.next();
	                    System.out.print("Enter employee department: ");
	                    department = sc.next();
	                    Employee.updateEmployee(id, name, department);
	                    System.out.println("Employee updated successfully");
	                    break;
	                case 4:
	                    System.out.print("Enter employee id: ");
	                    id = sc.nextInt();
	                    Employee.deleteEmployee(id);
	                    break;
	                case 5:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	                    break;
	            }
	        }
	    }
	}