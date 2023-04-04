package com.Assignment_3;

class Employee {
    private int id;
    private String name;
    private double salary;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class Q8_EmployeeGetterSetter {

	public static void main(String[] args) {

		    Employee employee = new Employee();
		   
		    employee.setId(1);
		    employee.setName("monu");
		    employee.setSalary(50000.00);
		    
		    System.out.println("ID: " + employee.getId());
		    System.out.println("Name: " + employee.getName());
		    System.out.println("Salary: $" + employee.getSalary());
		}
}